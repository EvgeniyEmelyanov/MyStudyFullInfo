fun main() {
    val words = listOf("kotlin", "java", "swift", "kotlin")

    // TODO: найди первое слово длиной > 5 (или null)
    // Подсказка: words.find { it.length > 5 }

    print(words.find { it.length > 5} + "\n")

    // TODO: посчитай, сколько раз встречается "kotlin"
    // Подсказка: words.count { it == "kotlin" }

    println(words.count { it == "kotlin" })


    // TODO: есть ли слово, начинающееся на 'j'?
    // Подсказка: words.any { it.startsWith("j") }

    println(words.any { it.startsWith("j") })

    // TODO: все ли слова короче 10 символов?
    // Подсказка: words.all { it.length < 10 }

    println(words.all { it.length < 10})

    // TODO: ни одно слово не начинается с "z"?
    // Подсказка: words.none { it.startsWith("z") }
    println(words.none { it.startsWith("z")})
}
