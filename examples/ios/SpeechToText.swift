// Speech-to-text example for iOS
func transcribeAudio(audio: Data) async throws -> String {
    let text = try await AI.transcribeAudio(audio)
    print("Transcription: \(text)")
    return text
}