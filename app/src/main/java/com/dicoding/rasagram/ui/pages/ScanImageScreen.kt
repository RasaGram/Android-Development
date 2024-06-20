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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.dicoding.rasagram.R
import com.dicoding.rasagram.data.repository.DishRepository
import com.dicoding.rasagram.ui.service.ImageClassifierHelper
import com.dicoding.rasagram.ui.service.Screens
import com.dicoding.rasagram.ui.theme.Orange
import java.io.File
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Objects

// Function to resize image


fun resizeImage(image: Bitmap, targetWidth: Int, targetHeight: Int): Bitmap {
    return Bitmap.createScaledBitmap(image, targetWidth, targetHeight, true)
}

// Function to convert Bitmap to ByteBuffer
fun convertBitmapToByteBuffer(bitmap: Bitmap): ByteBuffer {
    val inputSize = 224 // Expected input size
    val byteBuffer = ByteBuffer.allocateDirect(4 * inputSize * inputSize * 3)
    byteBuffer.order(ByteOrder.nativeOrder())

    val intValues = IntArray(inputSize * inputSize)
    bitmap.getPixels(intValues, 0, bitmap.width, 0, 0, bitmap.width, bitmap.height)

    intValues.forEach { pixelValue ->
        byteBuffer.putFloat(((pixelValue shr 16) and 0xFF) / 255.0f)
        byteBuffer.putFloat(((pixelValue shr 8) and 0xFF) / 255.0f)
        byteBuffer.putFloat((pixelValue and 0xFF) / 255.0f)
    }

    return byteBuffer
}

@Composable
fun ScanImagePage(
    navController: NavHostController,
    viewModel: ScanImageViewModel = viewModel()
) {
    val context = LocalContext.current
    val file = context.createImageFile()
    val dishRepository = DishRepository()
    val uri = FileProvider.getUriForFile(
        Objects.requireNonNull(context),
        context.packageName + ".provider", file
    )

    fun findDishIdByDishName(dishName: String): Int? {
        val dishes = dishRepository.getAllData()
        return dishes.find { it.dish_name.equals(dishName, ignoreCase = true) }?.id
    }

    var captureImageUri by remember {
        mutableStateOf<Uri>(Uri.EMPTY)
    }

    var resizedImageBitmap by remember {
        mutableStateOf<Bitmap?>(null)
    }

    val cameraLauncher = rememberLauncherForActivityResult(ActivityResultContracts.TakePicture()) {
        if (it) {
            captureImageUri = uri
            val resizedBitmap = resizeImage(BitmapFactory.decodeFile(file.path), 224, 224)
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

            // Convert the URI to a Bitmap and resize it
            uri?.let {
                context.contentResolver.openInputStream(it)?.use { inputStream ->
                    val originalBitmap = BitmapFactory.decodeStream(inputStream)
                    resizedImageBitmap = resizeImage(originalBitmap, 224, 224)
                }
            }
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
                if (captureImageUri.toString().isNotEmpty()) {
                    Image(
                        painter = rememberAsyncImagePainter(model = captureImageUri),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                } else if (selectedImageUri != null) {
                    Image(
                        painter = rememberAsyncImagePainter(model = selectedImageUri),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
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
                    resizedImageBitmap?.let { resizedBitmap ->
                        val classifier = ImageClassifierHelper(context)
                        val byteBuffer = convertBitmapToByteBuffer(resizedBitmap)
                        val (result,_) = classifier.classify(byteBuffer)
                        println("Classification result: $result")

                        val dishId = findDishIdByDishName(result)
                        if (dishId != null) {
                            // Navigate to DetailResepScreen with dishId
                            Toast.makeText(context, "Classification result: $result", Toast.LENGTH_LONG).show()
                            navController.navigate("${Screens.DetailResepScreen.route}/$dishId")
                        } else {
                            Toast.makeText(context, "Dish not found", Toast.LENGTH_LONG).show()
                        }


                    } ?: run {
                        Toast.makeText(context, "Please select or capture an image first", Toast.LENGTH_LONG).show()
                    }

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



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScanImagePagePreview() {
    ScanImagePage(navController = rememberNavController())
}