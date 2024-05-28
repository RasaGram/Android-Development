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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.rasagram.R
import com.dicoding.rasagram.ui.model.Validator
import com.dicoding.rasagram.ui.theme.Orange
import com.dicoding.rasagram.ui.theme.arialFamily
import com.dicoding.rasagram.ui.theme.poppinsFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrasiScreen(){
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var usernameError by remember { mutableStateOf("") }
    var emailError by remember { mutableStateOf("") }
    var passwordError by remember { mutableStateOf("") }

    val scrollState = rememberScrollState()

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(scrollState),
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
                        text = "SIGN UP",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Orange,
                            fontFamily = arialFamily
                        )
                    )
                    Text(
                        text = "Sign Up to get started",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = Orange,
                            fontFamily = arialFamily
                        )
                    )
                }
            }
            OutlinedTextField(
                value = username,
                onValueChange = {
                    username = it
                    val validationResult = Validator.validateUsername(it)
                    usernameError = if (validationResult.status) "" else "Username must be at least 4 characters long" },
                label = {
                    Text(
                        text = "Username",
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
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Orange,
                    unfocusedBorderColor = Orange
                ),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.username),
                        contentDescription = "Username Icon",
                        modifier = Modifier.size(20.dp),
                        tint = Orange
                    )
                },
                isError = usernameError.isNotEmpty()
            )
            if (usernameError.isNotEmpty()) {
                Text(
                    text = usernameError,
                    color = Color.Red,
                    style = TextStyle(fontSize = 12.sp)
                )
            }
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                    val validationResult = Validator.validateEmail(it)
                    emailError = if (validationResult.status) "" else "Email must end with @gmail.com" },
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
                },
                isError = emailError.isNotEmpty()
            )
            if (emailError.isNotEmpty()) {
                Text(
                    text = emailError,
                    color = Color.Red,
                    style = TextStyle(fontSize = 12.sp)
                )
            }
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                    val validationResult = Validator.validatePassword(it)
                    passwordError = if (validationResult.status) "" else "Password must be at least 8 characters long"},
                label = {
                    Text(
                        text = "Password",
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
                },
                isError = passwordError.isNotEmpty()
            )
            if (passwordError.isNotEmpty()) {
                Text(
                    text = passwordError,
                    color = Color.Red,
                    style = TextStyle(fontSize = 12.sp)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        val isUsernameValid = Validator.validateUsername(username).status
                        val isEmailValid = Validator.validateEmail(email).status
                        val isPasswordValid = Validator.validatePassword(password).status

                        if (isUsernameValid && isEmailValid && isPasswordValid) {
                            // Login logic here
                        } else {
                            if (!isUsernameValid) usernameError = "Username must be at least 6 characters long"
                            if (!isEmailValid) emailError = "Email cannot be empty"
                            if (!isPasswordValid) passwordError = "Password must be at least 8 characters long"
                        }
                              },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(51.23.dp),
                    shape = RoundedCornerShape(7.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Orange,
                        contentColor = Color.White
                    )
                ) {
                    Text(stringResource(R.string.Register))
                }
                Spacer(modifier = Modifier.height(16.dp))
                TextButton(
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = stringResource(R.string.do_you_have_account_sign_in),
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black,
                            fontFamily = arialFamily
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegistrasiScreenPreview(){
    RegistrasiScreen()
}
