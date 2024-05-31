package com.dicoding.rasagram.presentation.signup_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.rasagram.data.AuthRepository
import com.dicoding.rasagram.presentation.login_screen.SignInState
import com.dicoding.rasagram.util.Resource
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class SignUnViewModel @Inject constructor(
    private val repository: AuthRepository
): ViewModel(){

    val _signUnState = Channel<SignInState>()
    val signUnState = _signUnState.receiveAsFlow()

    fun registerUser(email:String, password:String) = viewModelScope.launch {
        repository.loginUser(email,password).collect{result ->
            when(result) {
                is Resource.Success ->{
                    _signUnState.send(SignInState(isSuccess = "Sign In Success"))
                }
                is Resource.Loading ->{
                    _signUnState.send(SignInState(isLoading = true))
                }
                is Resource.Error -> {
                    _signUnState.send(SignInState(isError = result.message))
                }
            }
        }
    }
}