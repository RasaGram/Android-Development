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

    private val labels = arrayOf(
        "Ayam Bakar", "Ayam Goreng", "Bakso", "Bakwan", "Batagor",
        "Bihun", "Capcay", "Gado-Gado", "Ikan Goreng", "Kerupuk",
        "Martabak Telur", "Mie Goreng", "Nasi Goreng", "Nasi Putih",
        "Nugget", "Opor Ayam", "Pempek", "Rendang", "Roti",
        "Sate", "Sosis", "Soto", "Steak", "Tahu", "Telur",
        "Tempe", "Terong Balado", "Tumis Kangkung", "Udang"
    )

    fun classify(byteBuffer: ByteBuffer): Pair<String, Float> {
        // Create input buffer for the model, assuming input shape (1, 224, 224, 3)
        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.FLOAT32)

        // Load the provided ByteBuffer into the TensorBuffer
        inputFeature0.loadBuffer(byteBuffer)

        // Run model inference and get the result
        val outputs = model.process(inputFeature0)
        val outputFeature0 = outputs.outputFeature0AsTensorBuffer

        // Get the index of the maximum confidence score
        val scores = outputFeature0.floatArray
        var maxScore = Float.MIN_VALUE
        var maxScoreIndex = -1

        for (i in scores.indices) {
            if (scores[i] > maxScore) {
                maxScore = scores[i]
                maxScoreIndex = i
            }
        }

        // Get the label corresponding to the maximum score index
        val label = if (maxScoreIndex != -1 && maxScoreIndex < labels.size) {
            labels[maxScoreIndex]
        } else {
            "Unknown"
        }

        // Release model resources
        model.close()

        return Pair(label, maxScore)
    }
}
