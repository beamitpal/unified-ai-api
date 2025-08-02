# iOS/macOS Implementation

## Overview
The `AI` API is built into UIKit/AppKit as a global `AI` class, using Apple Intelligence.

## Default Model
- Apple Intelligence (on-device or Private Cloud Compute).

## Integration
- Notifications: Uses `UNUserNotificationCenter`, e.g., `UNNotificationContent().setBody(AI.summarize(text))`.
- Hardware: Apple Silicon (M1/M2).
- System App: Settings > AI & Siri.

## Example
See [examples/ios/Notifications.swift](../../examples/ios/Notifications.swift).

## Challenges
- Strict sandboxing.
- Limited third-party model support.