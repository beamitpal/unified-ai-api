import ai # type: ignore
import notify2 # type: ignore

# AI-driven notification example for Linux
async def send_ai_notification(message):
    content = await ai.generate_notification_content(message, urgency="critical")
    notify2.init("AIApp")
    notification = notify2.Notification(content.title, content.body, urgency=notify2.URGENCY_CRITICAL)
    notification.show()

# Example usage
# asyncio.run(send_ai_notification("Urgent: Meeting at 3 PM!"))