package com.dicoding.rasagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.presentation.login_screen.SignInViewModel
import com.dicoding.rasagram.ui.MainNavHost
import com.dicoding.rasagram.ui.service.Screens
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val viewModel: SignInViewModel = hiltViewModel()
            MainNavHost(navController = navController, viewModel = viewModel, initialRoute = initialRoute(viewModel))
        }
    }

    private fun initialRoute(viewModel: SignInViewModel): String {
        return if (viewModel.isLoggedIn()) {
            Screens.MainScreen.route
        } else {
            Screens.LoginScreen.route
        }
    }
}


//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun SplashScreenPreview(){
//    SplashScreen(navController = navController = rememberNavController())
//}
