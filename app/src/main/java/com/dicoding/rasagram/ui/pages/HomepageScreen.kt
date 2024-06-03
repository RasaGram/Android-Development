package com.dicoding.rasagram.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.data.repository.DishRepository
import com.dicoding.rasagram.ui.widget.CustomIcon

@Composable
fun HomepageScreen(navController: NavHostController) {
    val dishRepository = DishRepository()
    val getAllData = dishRepository.getAllData()

    LazyColumn (
        modifier = Modifier.fillMaxHeight(),
        contentPadding = PaddingValues(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 96.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {
        items(items = getAllData){ dish ->
            CustomIcon(dish = dish)
        }
    }
}

@Preview
@Composable
fun HomepageScreenPreview(){
    HomepageScreen(navController = rememberNavController())
}
