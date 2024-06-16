package com.dicoding.rasagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            val viewModel: SignInViewModel = hiltViewModel()

            NavHost(navController, startDestination = if (viewModel.isLoggedIn()) Screens.MainScreen.route else Screens.LoginScreen.route) {
                composable(Screens.LoginScreen.route) {
                    LoginScreen(navController = navController, viewModel = viewModel)
                }
                composable(Screens.MainScreen.route) {
                    MainScreen(navController = navController)
                }
                composable(Screens.RegisterScreen.route){
                    val registerViewModel: SignUpViewModel = hiltViewModel()
                    RegistrasiScreen(navController = navController, registerViewModel)
                }
                composable(Screens.HomePageScreen.route){
                    HomepageScreen(navController = navController)
                }
                composable(Screens.SplashScreen.route){
                    SplashScreen(navController = navController)
                }
                composable(Screens.MainScreen.route){
                    MainScreen(navController = navController)
                }
                composable(Screens.ProfileScreen.route){
                    ScanImagePage(navController = navController)
                }
//                composable(Screens.DetailResepScreen.route){
//                    DetailResepScreen(navController = navController)
//                }

            }
        }
    }

}


//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun SplashScreenPreview(){
//    SplashScreen(navController = navController = rememberNavController())
//}
