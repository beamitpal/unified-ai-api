// Text analysis example for web
async function analyzeText(message) {
  const summary = await AI.summarize(message, 50);
  const sentiment = await AI.analyzeSentiment(message);
  console.log(`Summary: ${summary}`);
  console.log(`Sentiment: ${sentiment.label} (Score: ${sentiment.score})`);
}

// Example usage
analyzeText("I'm thrilled about the new project launch!");