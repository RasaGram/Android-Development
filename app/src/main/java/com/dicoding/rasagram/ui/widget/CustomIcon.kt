package com.dicoding.rasagram.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.data.model.Dish
import com.dicoding.rasagram.data.repository.DishRepository
import com.dicoding.rasagram.ui.service.Screens
import com.dicoding.rasagram.ui.theme.White
import com.dicoding.rasagram.ui.theme.poppinsFamily

@Composable
fun CustomIcon(navController: NavHostController, dish: Dish){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(200.dp)
            .shadow(8.dp, RoundedCornerShape(8.dp))
            .background(Color.White)
            .clickable(onClick = { navController.navigate("${Screens.DetailResepScreen.route}/${dish.id}") })
    ) {
        Column(
            modifier = Modifier
            .fillMaxSize()
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .size(200.dp),
                contentAlignment = Alignment.Center
                )
            {
                Image(
                    painter = painterResource(dish.image), // Replace with your drawable resource name
                    contentDescription = "Example Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(200.dp),
                    contentScale = ContentScale.FillBounds
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.6f)), // Lapisan gelap dengan transparansi
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = dish.dish_name,
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = White,
                            fontFamily = poppinsFamily
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomIcon(){
    val dishRepository = DishRepository()
    val sampleDish = dishRepository.getAllData().first() // Get the first dish for preview
    CustomIcon(dish = sampleDish, navController = rememberNavController())
}