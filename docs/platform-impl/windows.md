# Windows Implementation

## Overview
The `AI` API is integrated into Windows Runtime as `Windows.AI`, using Copilot or Windows ML.

## Default Model
- Copilot (Azure-based).
- Windows ML models (ONNX).

## Integration
- Notifications: Uses `ToastNotificationManager`, e.g., `ToastNotification(AI.generateNotificationContent(data))`.
- Hardware: DirectX 12 GPUs, NPUs.
- System App: Settings > AI & Copilot.

## Example
See [examples/windows/Notifications.cs](../../examples/windows/Notifications.cs).

## Challenges
- Limited non-UWP app support.
- Hardware requirements.