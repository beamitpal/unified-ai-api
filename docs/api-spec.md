# Unified AI API Specification

## Overview
The `AI` API is a native, no-import-required interface for AI tasks across platforms. It provides standardized methods for text generation, image analysis, and notification content creation.

## API Scope
- **Global Object**: `AI` (e.g., `window.AI` for web, `AI` for Android/iOS).
- **Permissions**: `AI.requestPermission(task: string): Promise<string>` (e.g., "granted", "denied").
- **Error Handling**: `AIError { code: string, message: string }`.

## Methods
```typescript
interface AI {
  generateText(prompt: string, options?: GenerateTextOptions): Promise<string>;
  summarize(text: string, maxLength?: number): Promise<string>;
  analyzeSentiment(text: string): Promise<SentimentResult>;
  analyzeImage(image: Blob | Buffer, task: string): Promise<ImageAnalysisResult>;
  transcribeAudio(audio: Blob | Buffer): Promise<string>;
  predict(data: any): Promise<PredictionResult>;
  generateNotificationContent(data: any, priority?: string): Promise<NotificationContent>;
  loadCustomModel(modelPath: string, options?: ModelOptions): Promise<void>;
  requestPermission(task: string): Promise<string>;
}

interface GenerateTextOptions {
  model?: string; // e.g., "gemini-nano", "apple-intelligence"
  maxTokens?: number;
  temperature?: number;
}

interface SentimentResult {
  score: number; // 0 to 1
  label: string; // e.g., "positive", "negative"
}

interface ImageAnalysisResult {
  labels: string[];
  confidence: number[];
}

interface PredictionResult {
  prediction: any;
  confidence: number;
}

interface NotificationContent {
  title: string;
  body: string;
  priority: string; // e.g., "high", "low"
}