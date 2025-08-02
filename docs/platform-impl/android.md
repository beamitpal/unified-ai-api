# Android Implementation

## Overview
The `AI` API is integrated into Android’s System Server as `android.ai.AI`, leveraging Gemini Nano/Pro.

## Default Model
- Gemini Nano (on-device, Snapdragon 8 Gen 3+).
- Gemini Pro (cloud).

## Integration
- Notifications: Uses `NotificationManager`, e.g., `NotificationCompat.Builder().setContentText(AI.summarize(text))`.
- Hardware: NPUs for on-device AI.
- System App: Settings > AI.

## Example
See [examples/android/Notifications.kt](../../examples/android/Notifications.kt).

## Challenges
- OEM fragmentation.
- Hardware limitations on older devices.