package com.dicoding.rasagram.ui.pages

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.dicoding.rasagram.R
import com.dicoding.rasagram.ui.service.ImageClassifierHelper
import com.dicoding.rasagram.ui.service.Screens
import com.dicoding.rasagram.ui.theme.Orange
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Objects

fun resizeImage(imagePath: String, targetWidth: Int, targetHeight: Int): Bitmap {
    val options = BitmapFactory.Options().apply {
        inJustDecodeBounds = true
    }
    BitmapFactory.decodeFile(imagePath, options)

    options.inSampleSize = calculateInSampleSize(options, targetWidth, targetHeight)
    options.inJustDecodeBounds = false

    val originalBitmap = BitmapFactory.decodeFile(imagePath, options)
    return Bitmap.createScaledBitmap(originalBitmap, targetWidth, targetHeight, true)
}


fun calculateInSampleSize(options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int): Int {
    val (height: Int, width: Int) = options.run { outHeight to outWidth }
    var inSampleSize = 1

    if (height > reqHeight || width > reqWidth) {
        val halfHeight: Int = height / 2
        val halfWidth: Int = width / 2

        while (halfHeight / inSampleSize >= reqHeight && halfWidth / inSampleSize >= reqWidth) {
            inSampleSize *= 2
        }
    }
    return inSampleSize
}

@Composable
fun ScanImagePage(
    navController: NavHostController,
    viewModel: ScanImageViewModel = viewModel()
) {
    val context = LocalContext.current
    val file = context.createImageFile()
    val uri = FileProvider.getUriForFile(
        Objects.requireNonNull(context),
        context.packageName + ".provider", file
    )

    var captureImageUri by remember {
        mutableStateOf<Uri>(Uri.EMPTY)
    }

    var resizedImageBitmap by remember {
        mutableStateOf<Bitmap?>(null)
    }

    val cameraLauncher = rememberLauncherForActivityResult(ActivityResultContracts.TakePicture()) {
        if (it) {
            captureImageUri = uri
            val resizedBitmap = resizeImage(file.path, 224, 224)
            resizedImageBitmap = resizedBitmap
        }
    }

    val permissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()) {
        if (it) {
            Toast.makeText(context, "Permission Granted", Toast.LENGTH_SHORT).show()
            cameraLauncher.launch(uri)
        } else {
            Toast.makeText(context, "Permission Denied", Toast.LENGTH_SHORT).show()
        }
    }

    var selectedImageUri by remember {
        mutableStateOf<Uri?>(null)
    }

    val selectPhoto = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickVisualMedia(),
        onResult = { uri ->
            selectedImageUri = uri
        }
    )

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp)
    ) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f),
                contentAlignment = Alignment.Center
            ) {
                if (resizedImageBitmap != null) {
                    Image(
                        bitmap = resizedImageBitmap!!.asImageBitmap(),
                        contentDescription = null
                    )
                } else if (captureImageUri.toString().isNotEmpty()) {
                    Image(
                        painter = rememberAsyncImagePainter(model = captureImageUri),
                        contentDescription = null
                    )
                } else if (selectedImageUri != null) {
                    Image(
                        painter = rememberAsyncImagePainter(model = selectedImageUri),
                        contentDescription = null
                    )
                } else {
                    Image(painter = painterResource(id = R.drawable.scan), contentDescription = null)
                }
            }
            Spacer(modifier = Modifier.height(11.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 0.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        selectPhoto.launch(
                            PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)
                        )
                    },
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
                    onClick = {
                        val permissionCheckResult =
                            ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA)

                        if (permissionCheckResult == PackageManager.PERMISSION_GRANTED) {
                            cameraLauncher.launch(uri)
                        } else {
                            permissionLauncher.launch(Manifest.permission.CAMERA)
                        }
                    },
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
                onClick = {
//                    resizedImageBitmap?.let { resizedBitmap ->
//                        val classifier = ImageClassifierHelper(context)
//                        val result = classifier.classify(resizedBitmap)
//                        println("Classification result: $result")
//                        Toast.makeText(context, "Classification result: $result", Toast.LENGTH_LONG).show()
//                    } ?: run {
//                        Toast.makeText(context, "Please select or capture an image first", Toast.LENGTH_LONG).show()
//                    }

                    when (viewModel.clickCount.value) {
                        0 -> {
                            navController.navigate("${Screens.DetailResepScreen.route}/1")
                        }
                        1 -> {
                            navController.navigate("${Screens.DetailResepScreen.route}/2")
                        }
                    }
                    viewModel.incrementClickCount()

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




@Composable
fun Context.createImageFile(): File {
    val timeStamp = SimpleDateFormat("yyyy_MM_dd_HH:mm:ss").format(Date())
    val imageFileName = "JPEG_" + timeStamp + "_"
    val image = File.createTempFile(
        imageFileName,
        ".jpg",
        externalCacheDir
    )
    return  image
}



//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun ScanImagePagePreview() {
//    ScanImagePage(navController = rememberNavController(), sharedPreferences = sharedPreferences)
//}