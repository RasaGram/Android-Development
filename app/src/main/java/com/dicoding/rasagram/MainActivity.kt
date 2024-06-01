package com.dicoding.rasagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.presentation.login_screen.SignInViewModel
import com.dicoding.rasagram.ui.Nav
import com.dicoding.rasagram.ui.pages.LoginScreen
import com.dicoding.rasagram.ui.pages.LoginScreenPreview
import com.dicoding.rasagram.ui.pages.MainScreen
import com.dicoding.rasagram.ui.pages.ProfileScreen
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
            }
        }
    }
}


//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun SplashScreenPreview(){
//    SplashScreen(navController = navController = rememberNavController())
//}
