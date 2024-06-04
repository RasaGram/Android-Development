package com.dicoding.rasagram.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.presentation.login_screen.SignInViewModel
import com.dicoding.rasagram.presentation.signup_screen.SignUpViewModel
import com.dicoding.rasagram.ui.service.Screens
import com.dicoding.rasagram.ui.theme.Black
import com.dicoding.rasagram.ui.theme.Orange
import com.dicoding.rasagram.ui.theme.poppinsFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(viewModel : SignInViewModel= hiltViewModel(),
                  navController: NavHostController) {
    var username by remember { mutableStateOf("") }
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Rectangle shape
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(300.dp) // Rectangle dimensions
                    .clip(
                        RoundedCornerShape(
                            bottomStart = 20.dp,
                            bottomEnd = 20.dp
                        )
                    ) // Optional: Rounded corners
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.White, Orange)
                        )
                    ),
                contentAlignment = Alignment.Center// Background color to make it visible
            ){
                Box(
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                        .background(color = Color.White)
                )
            }
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                    text = "Username",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 25.dp) // Optional: Add padding for spacing
                        .align(Alignment.Start), // Align to the left
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
            )
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = {
                    Text(
                        text = "Username", //Filled with real username
                        style = TextStyle(
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Bold,
                            color = Black,
                            fontSize = 12.sp
                        )
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp),
                shape = RoundedCornerShape(7.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Black,
                    unfocusedBorderColor = Black
                )
            )
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                onClick = { /* login logic here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(51.23.dp)
                    .padding(horizontal = 25.dp),
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Orange,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Save")
            }
            Spacer(modifier = Modifier.height(120.dp))
            Button(
                onClick = {
                    viewModel.logout(navController = navController)
//                    navController.navigate(Screens.LoginScreen.route)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(51.23.dp)
                    .padding(horizontal = 25.dp),
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Orange,
                    contentColor = Color.White
                )
            ) {
                Text(text = "LogOut")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen(navController = rememberNavController())
}
