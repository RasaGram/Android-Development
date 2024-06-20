package com.dicoding.rasagram.ui.pages

import android.Manifest
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.R
import com.dicoding.rasagram.data.repository.DishRepository
import com.dicoding.rasagram.ui.theme.Orange
import com.dicoding.rasagram.ui.theme.poppinsFamily
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat

@Composable
fun DetailResepScreen(navController: NavHostController, dishId : Int) {
    val dish = DishRepository().getDishById(dishId)
    val context = LocalContext.current
    var permissionGranted by remember { mutableStateOf(false) }
    val requestPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        permissionGranted = isGranted
    }
    LaunchedEffect(Unit) {
        when {
            ContextCompat.checkSelfPermission(context, Manifest.permission.INTERNET) == PackageManager.PERMISSION_GRANTED -> {
                // Permission is already granted
                permissionGranted = true
            }
            else -> {
                // Request permission
                requestPermissionLauncher.launch(Manifest.permission.INTERNET)
            }
        }
    }
    if (dish != null){
        Surface {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(300.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(color = Color.Black)
                ) {
                    Image(
                        painter = painterResource(dish.image),
                        contentDescription = "Your Image Description",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = dish.dish_name,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Orange,
                        fontFamily = poppinsFamily
                    ),
                    modifier = Modifier.align(Alignment.Start)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth() // Adjust height as needed
                        .clip(RoundedCornerShape(8.dp))
                        .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp)) // Border
                        .background(Color.White)
                        .padding(16.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column (modifier = Modifier,
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start)
                    {

                        Text(
                            text = "Bahan-bahan", // Your text here
                            style = TextStyle(
                                fontSize = 16.sp,
                                color = Color.Black,
                                fontWeight = Bold,
                                fontFamily = poppinsFamily
                            )
                        )
                        Text(
                            text = dish.ingredients, // Your text here
                            style = TextStyle(
                                fontSize = 16.sp,
                                color = Color.Black,
                                fontFamily = poppinsFamily
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth() // Adjust height as needed
                        .clip(RoundedCornerShape(8.dp))
                        .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp)) // Border
                        .background(Color.White)
                        .padding(16.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column (modifier = Modifier,
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start)
                    {

                        Text(
                            text = "Cara Memasak", // Your text here
                            style = TextStyle(
                                fontSize = 16.sp,
                                color = Color.Black,
                                fontWeight = Bold,
                                fontFamily = poppinsFamily
                            )
                        )
                        Text(
                            text = dish.description, // Your text here
                            style = TextStyle(
                                fontSize = 16.sp,
                                color = Color.Black,
                                fontFamily = poppinsFamily
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {
                        if (permissionGranted) {
                            // Create the search query string
                            val query = Uri.encode("${dish.dish_name} terdekat")
                            // Create the URI for the Google Maps search query
                            val gmmIntentUri = Uri.parse("geo:0,0?q=$query")
                            // Create an intent to launch Google Maps
                            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                            // Launch the Google Maps activity
                            context.startActivity(mapIntent)
                        } else {
                            // Optionally show a message to the user that permission is required
                            Log.e("DetailResepScreen", "Permission not granted")
                        }
                    },
                    modifier = Modifier
                        .size(200.dp, 40.dp),
                    shape = RoundedCornerShape(7.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Orange,
                        contentColor = Color.White
                    )
                ) {
                    Text("Cek Warung Terdekat")
                }
            }
        }
    }
}

@Preview
@Composable
fun DetailResepScreenPreview(){
    DetailResepScreen(navController = rememberNavController(), 1)

}