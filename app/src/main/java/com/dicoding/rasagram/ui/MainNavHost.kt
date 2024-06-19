package com.dicoding.rasagram.ui

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dicoding.rasagram.presentation.login_screen.SignInViewModel
import com.dicoding.rasagram.presentation.signup_screen.SignUpViewModel
import com.dicoding.rasagram.ui.pages.DetailResepScreen
import com.dicoding.rasagram.ui.pages.HomepageScreen
import com.dicoding.rasagram.ui.pages.LoginScreen
import com.dicoding.rasagram.ui.pages.MainScreen
import com.dicoding.rasagram.ui.pages.RegistrasiScreen
import com.dicoding.rasagram.ui.pages.ScanImagePage
import com.dicoding.rasagram.ui.pages.SplashScreen
import com.dicoding.rasagram.ui.service.Screens

@Composable
fun MainNavHost(navController: NavHostController, viewModel: SignInViewModel, initialRoute: String) {
    NavHost(navController = navController, startDestination = initialRoute) {
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
            ScanImagePage(navController = navController,sharedPreferences = LocalContext.current.getSharedPreferences("my_app_prefs", Context.MODE_PRIVATE))
        }
        composable(Screens.DetailResepScreen.route) {
            DetailResepScreen(navController = navController)
        }
//        composable(
//            route = "${Screens.DetailResepScreen.route}/{dishId}",
//            arguments = listOf(navArgument("dishId") { type = NavType.IntType })
//        ) { backStackEntry ->
//            val dishId = backStackEntry.arguments?.getInt("dishId") ?: 0
//            val dish = DishRepository().getDishById(dishId)
//            if (dish != null) {
//                DetailResepScreen(navController = navController, dish = dish)
//            } else {
//                // Handle error or navigate to a fallback screen
//                Text("Dish not found")
//            }
//        }
    }
}

private fun initialRoute(viewModel: SignInViewModel): String {
    return if (viewModel.isLoggedIn()) {
        Screens.MainScreen.route
    } else {
        Screens.LoginScreen.route
    }
}

