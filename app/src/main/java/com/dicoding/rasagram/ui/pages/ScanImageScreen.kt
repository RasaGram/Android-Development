package com.dicoding.rasagram.ui.pages

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.rasagram.R
import com.dicoding.rasagram.ui.theme.Orange
import com.dicoding.rasagram.ui.theme.arialFamily

@Composable
fun ScanImagePage(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(10.dp)
    ) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(painter = painterResource(id = R.drawable.scan), contentDescription = "Splash Screen" )
            Spacer(modifier = Modifier.height(11.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 0.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = { /* galeri logic here */ },
                    modifier = Modifier
                        .weight(1f)
                        .height(51.23.dp)
                        .padding(horizontal = 5.dp),
                    shape = RoundedCornerShape(7.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Orange,
                        contentColor = Color.White
                    )
                ) {
                    Text(stringResource(R.string.Galeri))
                }
                Spacer(modifier = Modifier.width(40.dp))
                Button(
                    onClick = { /* camera logic here */ },
                    modifier = Modifier
                        .weight(1f)
                        .height(51.23.dp)
                        .padding(horizontal = 5.dp),
                    shape = RoundedCornerShape(7.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Orange,
                        contentColor = Color.White
                    )
                ) {
                    Text(stringResource(R.string.Camera))
                }
            }
            Spacer(modifier = Modifier.height(48.dp))
            Button(
                onClick = { /* login logic here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(51.23.dp),
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScanImagePagePreview() {
    ScanImagePage()
}