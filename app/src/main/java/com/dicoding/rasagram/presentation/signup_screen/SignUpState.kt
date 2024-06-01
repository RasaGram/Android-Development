package com.dicoding.rasagram.presentation.signup_screen

data class SignUpState(
    val isLoading: Boolean = false,
    val isSuccess: String? = null,
    val isError: String? = null

)