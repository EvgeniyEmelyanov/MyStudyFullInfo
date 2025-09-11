fun wordFrequency(
    text: String,
    minLen: Int = 1
): List<Pair<String, Int>> {
    val words = text.lowercase()
        .replace(Regex("[^\\p{L}\\s]"), "")
        .trim()

    val wordList = words.split(Regex("\\s+"))
        .filter { it.length >= minLen }

    val counts = wordList.groupingBy { it }.eachCount()

    return counts
        .toList()
    .sortedWith (
        compareBy<Pair<String, Int>>() { it.second }
            .thenBy { it.first }
    )
}

fun main() {
    val text = "Hello, hello!! Kotlin — is great. Привет, Kotlin!"
    val freq = wordFrequency(text, minLen = 2)
    println(freq)
}
