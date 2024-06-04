package com.dicoding.rasagram.ui

import androidx.compose.runtime.Composable
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
            ScanImagePage(navController)
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen(navController = rememberNavController())
        }
    }
}