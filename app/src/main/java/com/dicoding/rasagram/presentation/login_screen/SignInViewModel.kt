package com.dicoding.rasagram.presentation.login_screen

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavHostController
import com.dicoding.rasagram.data.repository.AuthRepository
import com.dicoding.rasagram.ui.service.Screens
import com.dicoding.rasagram.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val repository: AuthRepository,
    private val sharedPreferences: SharedPreferences

): ViewModel() {

    private val _signInState = Channel<SignInState>()
    val signInState = _signInState.receiveAsFlow()

    fun loginUser(email:String, password:String) = viewModelScope.launch {
        repository.loginUser(email,password).collect{result ->
            when(result) {
                is Resource.Success ->{
                    _signInState.send(SignInState(isSuccess = "Sign In Success"))
                    sharedPreferences.edit().putBoolean("is_logged_in", true).apply()
                }
                is Resource.Loading ->{
                    _signInState.send(SignInState(isLoading = true))
                }
                is Resource.Error -> {
                    _signInState.send(SignInState(isError = result.message))
                }
            }
        }
    }

    fun isLoggedIn(): Boolean {
        return sharedPreferences.getBoolean("is_logged_in", false)
    }

    fun logout(navController: NavHostController) {
        sharedPreferences.edit().remove("is_logged_in").apply()
        navController.navigate(Screens.LoginScreen.route)
    }
}

