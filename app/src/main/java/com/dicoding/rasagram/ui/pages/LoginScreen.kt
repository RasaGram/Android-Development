package com.dicoding.rasagram.ui.pages

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dicoding.rasagram.R
import com.dicoding.rasagram.presentation.login_screen.SignInViewModel
import com.dicoding.rasagram.ui.service.Screens
import com.dicoding.rasagram.ui.theme.Orange
import com.dicoding.rasagram.ui.theme.arialFamily
import com.dicoding.rasagram.ui.theme.poppinsFamily
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    navController: NavHostController,
    viewModel: SignInViewModel = hiltViewModel(),
    sharedPreferences: SharedPreferences = LocalContext.current.getSharedPreferences("my_app_prefs", Context.MODE_PRIVATE)
){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val state = viewModel.signInState.collectAsState(initial = null)

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(83.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(R.string.rasagram),
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Orange,
                        fontFamily = poppinsFamily
                    )
                )
            }
            Spacer(modifier = Modifier.height(79.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Column {
                    Text(
                        text = stringResource(R.string.sign_in),
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Orange,
                            fontFamily = arialFamily
                        )
                    )
                    Text(
                        text = stringResource(R.string.sign_in_to_continue),
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = Orange,
                            fontFamily = arialFamily
                        )
                    )
                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = {
                            Text(
                                text = "Email",
                                style = TextStyle(
                                    fontFamily = arialFamily,
                                    fontWeight = FontWeight.Bold,
                                    color = Orange,
                                    fontSize = 12.sp
                                )
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(7.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Orange,
                            unfocusedBorderColor = Orange
                        ),
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.email),
                                contentDescription = "Email Icon",
                                modifier = Modifier.size(20.dp),
                                tint = Orange
                            )
                        }
                    )
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = {
                            Text(
                                text = "Password",
                                style = TextStyle(
                                    fontFamily = arialFamily,
                                    fontWeight = FontWeight.Bold,
                                    color = Orange, // Ubah warna teks
                                    fontSize = 12.sp // Ubah ukuran teks
                                )
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(7.dp),
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Orange,
                            unfocusedBorderColor = Orange
                        ),
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.password),
                                contentDescription = "Username Icon",
                                modifier = Modifier.size(20.dp),
                                tint = Orange
                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Button(
                            onClick = {
                                viewModel.loginUser(email, password)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(51.23.dp),
                            shape = RoundedCornerShape(7.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Orange,
                                contentColor = Color.White
                            ),
                        ) {
                            Text(stringResource(R.string.login))
                        }
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                            if (state.value?.isLoading == true) {
                                CircularProgressIndicator()
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        TextButton(
                            onClick = {
                                navController.navigate(Screens.RegisterScreen.route)
                            }) {
                            Text(
                                text = "Don’t have account? Sign up",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black,
                                    fontFamily = arialFamily
                                )
                            )
                        }
                        LaunchedEffect(key1 = state.value?.isSuccess) {
                            scope.launch {
                                if (state.value?.isSuccess?.isNotEmpty() == true) {
                                    val success = state.value?.isSuccess
                                    Toast.makeText(context, "${success}", Toast.LENGTH_LONG).show()
                                    // Simpan status login ke Shared Preferences saat login berhasil
                                    sharedPreferences.edit().putBoolean("is_logged_in", true).apply()
                                    navController.navigate("MainScreen")
                                }
                            }
                        }
                        LaunchedEffect(key1 = state.value?.isError) {
                            scope.launch {
                                if (state.value?.isError?.isNotEmpty() == true) {
                                    val error = state.value?.isError
                                    Toast.makeText(context, "${error}", Toast.LENGTH_LONG).show()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(navController = rememberNavController())
}
