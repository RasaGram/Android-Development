package com.dicoding.rasagram.presentation.login_screen

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.dicoding.rasagram.data.AuthRepository
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

    // Method untuk login user
    fun loginUser(email:String, password:String) = viewModelScope.launch {
        repository.loginUser(email,password).collect{result ->
            when(result) {
                is Resource.Success ->{
                    _signInState.send(SignInState(isSuccess = "Sign In Success"))
                    // Simpan status login ke Shared Preferences saat login berhasil
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

    // Method untuk memeriksa status login
    fun isLoggedIn(): Boolean {
        return sharedPreferences.getBoolean("is_logged_in", false)
    }

    fun logout(navController: NavController) {
        sharedPreferences.edit().remove("is_logged_in").apply()
        navController.navigate("Register") {
            popUpTo("Register") { inclusive = true }
        }
    }
}

