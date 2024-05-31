package com.dicoding.rasagram.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.ui.pages.HomepageScreen
import com.dicoding.rasagram.ui.pages.LoginScreen
import com.dicoding.rasagram.ui.pages.RegistrasiScreen
import com.dicoding.rasagram.ui.pages.SplashScreen
import com.dicoding.rasagram.ui.service.Screens

@Composable
fun Nav(contorller: NavController){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.SplashScreen.route){

        composable(Screens.LoginScreen.route){
            LoginScreen(navController)
        }
        composable(Screens.RegisterScreen.route){
            RegistrasiScreen(navController)
        }

        composable(Screens.HomePageScreen.route){
            HomepageScreen(navController)
        }

        composable(Screens.SplashScreen.route){
            SplashScreen(navController)
        }
    }
}