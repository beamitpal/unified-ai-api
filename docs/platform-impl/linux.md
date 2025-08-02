# Linux Implementation

## Overview
The `AI` API is provided via `libai`, standardized by freedesktop.org, using open-source models.

## Default Model
- Llama, Mistral (TensorFlow/PyTorch).

## Integration
- Notifications: Uses `libnotify`, e.g., `notify_send(AI.summarize(text))`.
- Hardware: GPU/NPU support via OpenCL.
- System App: GNOME/KDE Settings.

## Example
See [examples/linux/notifications.py](../../examples/linux/notifications.py).

## Challenges
- Distribution fragmentation.
- No native push notifications.