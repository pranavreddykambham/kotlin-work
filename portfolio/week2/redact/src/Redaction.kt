fun redact(
    document: String,
    text: String,
    replacement: Char = 'X'
): String {
    if (text.isEmpty()) {
        return document
    }

    val replacementText = replacement.toString().repeat(text.length)

    return document.replace(text, replacementText)
}
