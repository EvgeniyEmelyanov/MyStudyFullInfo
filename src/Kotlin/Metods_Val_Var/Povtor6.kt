fun main() {
    val nums = listOf(5, 1, 8, 3, 2)
    println(nums.sorted())
    println(nums.sortedDescending())

    val words = listOf("hi", "kotlin", "java", "cat")
    println(words.sortedBy { it.length })
    println(words.sortedByDescending { it.length })

    val people = listOf("Charlie", "Alice", "Bob")
    println(people.sorted())
    println(people.sortedDescending())

    val words1 = listOf("hi", "java", "cat", "kotlin", "dog")

    val sort = words1.sortedWith (
        compareByDescending<String>{ it.length }
            .thenBy { it })
    println(sort)



}
