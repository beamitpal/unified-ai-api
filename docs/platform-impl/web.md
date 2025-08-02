# Web Implementation

## Overview
The `AI` API is implemented as `window.AI` in browsers, using WebGPU for on-device AI and cloud fallback.

## Default Model
- Chrome: Gemini Nano/Pro.
- Safari: Apple Intelligence.
- Firefox: Open-source models (e.g., Llama).

## Integration
- Notifications: Uses `Notification` API, e.g., `new Notification(AI.generateNotificationContent(data).title)`.
- Hardware: WebGPU for NPUs/GPUs, WebAssembly for models.
- System App: Browser settings (e.g., `chrome://ai-settings`).

## Example
See [examples/web/notifications.js](../../examples/web/notifications.js).

## Challenges
- Browser fragmentation (Safari’s WebGPU support).
- User permissions for sensitive tasks.