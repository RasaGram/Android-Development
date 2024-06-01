package com.dicoding.rasagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.ui.Nav
import com.dicoding.rasagram.ui.pages.LoginScreen
import com.dicoding.rasagram.ui.pages.LoginScreenPreview
import com.dicoding.rasagram.ui.pages.SplashScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Nav(rememberNavController())
//            MainScreen()
//            RegistrasiScreen()
//            LoginScreen()
//            SplashScreen(navController = rememberNavController())
//            LoginScreenPreview()
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun SplashScreenPreview(){
//    SplashScreen(navController = navController = rememberNavController())
//}
