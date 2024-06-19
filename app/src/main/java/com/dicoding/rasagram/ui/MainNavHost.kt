package com.dicoding.rasagram.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.dicoding.rasagram.presentation.login_screen.SignInViewModel
import com.dicoding.rasagram.presentation.signup_screen.SignUpViewModel
import com.dicoding.rasagram.ui.pages.DetailResepScreen
import com.dicoding.rasagram.ui.pages.HomepageScreen
import com.dicoding.rasagram.ui.pages.LoginScreen
import com.dicoding.rasagram.ui.pages.MainScreen
import com.dicoding.rasagram.ui.pages.ProfileScreen
import com.dicoding.rasagram.ui.pages.RegistrasiScreen
import com.dicoding.rasagram.ui.pages.ScanImagePage
import com.dicoding.rasagram.ui.pages.SplashScreen
import com.dicoding.rasagram.ui.service.Screens

@Composable
fun MainNavHost(navController: NavHostController, viewModel: SignInViewModel) {
    NavHost(navController = navController, startDestination = if (viewModel.isLoggedIn()) Screens.HomePageScreen.route else Screens.LoginScreen.route) {
        composable(Screens.LoginScreen.route) {
            LoginScreen(navController = navController, viewModel = viewModel)
        }
        composable(Screens.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(Screens.RegisterScreen.route) {
            val registerViewModel: SignUpViewModel = hiltViewModel()
            RegistrasiScreen(navController = navController, viewModel = registerViewModel)
        }
        composable(Screens.HomePageScreen.route) {
            HomepageScreen(navController = navController)
        }
        composable(Screens.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screens.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(Screens.DetailResepScreen.route) {
            DetailResepScreen(navController = navController, dishId = 0)
        }
        composable(Screens.ScanImageScreen.route) {
            ScanImagePage(navController = navController)
        }
        composable(
            route = "${Screens.DetailResepScreen.route}/{dishId}",
            arguments = listOf(navArgument("dishId") { type = NavType.IntType })
        ) { backStackEntry ->
            val dishId = backStackEntry.arguments?.getInt("dishId") ?: 0
            DetailResepScreen(navController = navController, dishId = dishId)
        }
    }
}

private fun initialRoute(viewModel: SignInViewModel): String {
    return if (viewModel.isLoggedIn()) {
        Screens.HomePageScreen.route
    } else {
        Screens.LoginScreen.route
    }
}

