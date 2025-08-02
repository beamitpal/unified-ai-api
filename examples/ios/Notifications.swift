import UserNotifications

// AI-driven notification example for iOS
func sendAINotification(message: String) async throws {
    let content = try await AI.generateNotificationContent(message, priority: "high")
    let notification = UNMutableNotificationContent()
    notification.title = content.title
    notification.body = content.body
    notification.sound = .defaultCritical
    let request = UNNotificationRequest(identifier: UUID().uuidString, content: notification, trigger: nil)
    try await UNUserNotificationCenter.current().add(request)
}

// Example usage
// try await sendAINotification("Urgent: Meeting at 3 PM!")