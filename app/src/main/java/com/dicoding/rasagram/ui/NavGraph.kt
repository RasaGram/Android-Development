package com.dicoding.rasagram.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.presentation.signup_screen.SignUpViewModel
import com.dicoding.rasagram.ui.pages.HomepageScreen
import com.dicoding.rasagram.ui.pages.LoginScreen
import com.dicoding.rasagram.ui.pages.MainScreen
import com.dicoding.rasagram.ui.pages.RegistrasiScreen
import com.dicoding.rasagram.ui.pages.SplashScreen
import com.dicoding.rasagram.ui.service.Screens

//@Composable
//fun Nav(controller: NavHostController){
//
//    NavHost(navController = controller, startDestination = Screens.SplashScreen.route){
//
//        composable(Screens.LoginScreen.route){
//            LoginScreen(controller)
//        }
//        composable(Screens.RegisterScreen.route){
//            val registerViewModel: SignUpViewModel = hiltViewModel()
//            RegistrasiScreen(controller, registerViewModel)
//        }
//
//        composable(Screens.HomePageScreen.route){
//            HomepageScreen(controller)
//        }
//
//        composable(Screens.SplashScreen.route){
//            SplashScreen(controller)
//        }
//
//        composable(Screens.MainScreen.route){
//            MainScreen(controller)
//        }
//    }
//}

