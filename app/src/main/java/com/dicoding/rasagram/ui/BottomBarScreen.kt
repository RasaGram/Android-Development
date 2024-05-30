package com.dicoding.rasagram.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.dicoding.rasagram.R

sealed class BottomBarScreen (
    val route: String,
    val title: String,
    val icon: Any
) {
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Scan: BottomBarScreen(
        route = "scan",
        title = "Scan",
        icon = R.drawable.ic_camera
    )
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
}