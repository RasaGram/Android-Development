package com.dicoding.rasagram.ui.service

import android.content.Context
import android.graphics.Bitmap
import com.dicoding.rasagram.ml.Berasa
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.nio.ByteBuffer

class ImageClassifierHelper(context: Context) {
    private val model: Berasa = Berasa.newInstance(context)

    fun classify(image: Bitmap): String {
        // Preprocess the image to fit the model input requirements
        val tensorImage = TensorImage.fromBitmap(image)
        val byteBuffer = tensorImage.buffer

        // Create input buffer
        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.FLOAT32)
        inputFeature0.loadBuffer(byteBuffer)

        // Run model inference and get result
        val outputs = model.process(inputFeature0)
        val outputFeature0 = outputs.outputFeature0AsTensorBuffer

        // Release model resources
        model.close()

        // Retrieve the output and map it to a readable label if necessary
        return outputFeature0.floatArray[0].toString()
    }
}
