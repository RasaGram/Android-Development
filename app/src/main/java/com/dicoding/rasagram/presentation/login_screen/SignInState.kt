package com.dicoding.rasagram.presentation.login_screen

data class SignInState(
    val isLoading: Boolean = false,
    val isSuccess: String? = null,
    val isError: String? = null
)