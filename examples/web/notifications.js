// AI-driven notification example for web
async function sendAINotification(message) {
  if (await Notification.requestPermission() === "granted") {
    const content = await AI.generateNotificationContent(message, "high");
    new Notification(content.title, {
      body: content.body,
      priority: content.priority
    });
  }
}

// Example usage
sendAINotification("Urgent: Meeting at 3 PM with critical updates!");