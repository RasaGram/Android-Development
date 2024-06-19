package com.dicoding.rasagram.ui

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.ui.pages.HomepageScreen
import com.dicoding.rasagram.ui.pages.ProfileScreen
import com.dicoding.rasagram.ui.pages.ScanImagePage


@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route){
            HomepageScreen(navController)
        }
        composable(route = BottomBarScreen.Scan.route){
            ScanImagePage(
                sharedPreferences = LocalContext.current.getSharedPreferences("my_app_prefs", Context.MODE_PRIVATE),
                navController = navController)
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen(navController = rememberNavController())
        }
    }
}