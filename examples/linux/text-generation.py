import ai # type: ignore

# Text generation example for Linux
async def generate_text(prompt):
    text = await ai.generate_text(prompt, options={"max_tokens": 50})
    print(f"Generated: {text}")
    return text

# Example usage
# asyncio.run(generate_text("Write a short meeting reminder"))