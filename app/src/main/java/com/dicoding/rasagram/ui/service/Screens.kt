package com.dicoding.rasagram.ui.service

sealed class Screens(val route : String) {
    object LoginScreen : Screens("Login")
    object RegisterScreen : Screens("Register")
    object HomePageScreen : Screens("HomePage")
    object SplashScreen : Screens("Splash")
    object MainScreen : Screens("MainScreen")
    object ProfileScreen : Screens("ProfileScreen")
    object DetailResepScreen : Screens("DetailResepScreen")
    object ScanImageScreen : Screens("ScanImageScreen")
}