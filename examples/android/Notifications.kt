package com.example.aiapp

import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

// AI-driven notification example for Android
suspend fun sendAINotification(context: Context, message: String) {
    val content = AI.generateNotificationContent(message, "high")
    val notification = NotificationCompat.Builder(context, "channel_id")
        .setContentTitle(content.title)
        .setContentText(content.body)
        .setPriority(NotificationCompat.PRIORITY_HIGH)
        .setSmallIcon(R.drawable.ic_notification)
        .build()
    NotificationManagerCompat.from(context).notify(1, notification)
}

// Example usage
// sendAINotification(context, "Urgent: Meeting at 3 PM!")