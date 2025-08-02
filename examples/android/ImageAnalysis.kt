package com.example.aiapp

import android.content.Context
import android.graphics.Bitmap

// Image analysis example for Android
suspend fun analyzeImage(context: Context, bitmap: Bitmap) {
    val result = AI.analyzeImage(bitmap, "object-detection")
    result.labels.forEachIndexed { index, label ->
        println("Object: $label, Confidence: ${result.confidence[index]}")
    }
}