package com.dicoding.rasagram.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.R
import com.dicoding.rasagram.data.repository.DishRepository
import com.dicoding.rasagram.ui.service.Screens
import com.dicoding.rasagram.ui.theme.Orange
import com.dicoding.rasagram.ui.theme.White
import com.dicoding.rasagram.ui.theme.poppinsFamily
import com.dicoding.rasagram.ui.widget.CustomIcon

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomepageScreen(navController: NavHostController) {
    val dishRepository = DishRepository()
    val getAllData = dishRepository.getAllData()
    var searchText by remember{ mutableStateOf("") }

    Scaffold(

    ) { innerPadding ->
        Column(modifier = Modifier
            .fillMaxHeight()
            .padding(innerPadding)) {
            Surface(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp),
                color = Color.Black
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    // Your Box content goes here

                    Image(
                        painter = painterResource(id = R.drawable.background), // Replace with your drawable resource name
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
                    ) {
                        Column (Modifier.padding(20.dp)){
                            Text(
                                text = "Welcome",
                                style = TextStyle(
                                    fontSize = 40.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = White,
                                    fontFamily = poppinsFamily
                                )
                            )
//                            Spacer(modifier = Modifier.height(45.dp))
                            OutlinedTextField(
                                value = searchText,
                                onValueChange = { searchText = it },
                                label = {
                                    Text(
                                        text = "Search", // Specify your label text here
                                        style = TextStyle(
                                            fontFamily = poppinsFamily,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White, // Set text color to white
                                            fontSize = 15.sp,
                                            textAlign = TextAlign.Center
                                        )
                                    )
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(56.dp), // Set desired height here
                                shape = RoundedCornerShape(25.dp),
                                textStyle = TextStyle(color = Color.White), // Set text color in TextStyle
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                    focusedBorderColor = Color.White,
                                    unfocusedBorderColor = Color.White,
                                    cursorColor = Color.White // Set cursor color to white
                                ),
                                leadingIcon = {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = "Search Icon",
                                        tint = Color.White // Set icon tint color to white
                                    )
                                }
                            )
                            Button(
                                onClick = {
                                    navController.navigate(Screens.DetailResepScreen.route)
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(51.23.dp)
                                    .padding(horizontal = 5.dp),
                                shape = RoundedCornerShape(7.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Orange,
                                    contentColor = Color.White
                                )
                            ) {
                                Text(stringResource(R.string.Scan))
                            }
                        }
                    }
                }
            }
            LazyColumn(
                modifier = Modifier.fillMaxHeight(),
                contentPadding = PaddingValues(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 96.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(items = getAllData.filter { it.dish_name.contains(searchText, ignoreCase = true) }) { dish ->
                    CustomIcon(dish = dish, navController = navController)
                }
            }
        }
    }
}


@Preview
@Composable
fun HomepageScreenPreview(){
    HomepageScreen(navController = rememberNavController())
}
