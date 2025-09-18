fun main() {
    val nums = listOf(1, 2, 3, 4, 5)

    println(nums.map { it * it })

    val words = listOf("cat", "java", "hi", "kotlin", "ok")
    println(words.filter { it.length > 3 })


    val phoneBook = mapOf(
        "Alice" to "+123",
        "Bob" to "+456"
    )

    phoneBook.forEach { k, v -> println("$k = $v") }


    val words1 = listOf("hi", "cat", "java", "ok", "kotlin")

    val words2 = words1.filter { it.length > 2 }
    for (word in words2) {
        println(word.uppercase())
    }

    val words3 = listOf("hi", "cat", "java", "ok", "kotlin")

    val words4 = words3.filter { it.length > 3 }
        .map { it.uppercase() }
        .onEach { println("$it --") }
        .count()
    println(words4)

    println()
    val nums1 = listOf(1, 2, 3, 4, 5)

    val squares = nums1
        .onEach { println("Берем число $it") }
        .map { it * it }
        .onEach { println("Число после возведения в степень $it") }

    println("Res: $squares")

}
