import kotlin.comparisons.compareBy

data class Student(val name: String, val age: Int, val i: Int)

fun main() {
    val students = listOf(
        Student("Charlie", 22, 19),
        Student("Alice", 25, 19),
        Student("Bob", 22, 19),
        Student("Dave", 20, 19)
    )

    val sort = students.sortedWith(
        compareBy<Student>{ it.age }
            .thenBy { it.name}
    )
    for (student in sort) {
        println(student)
    }

    val words = listOf("hi", "kotlin", "java", "programming", "cat", "developer")

    val sortedWords = words.sortedWith(
        compareByDescending { it.length }
    )
    println(sortedWords.take(3))

    val words2 = listOf("banana", "Apple", "cherry", "apricot", "Dog")


    val sortedWords2 = words2.sortedBy { it.lowercase() }

    println(sortedWords2)


    val nums = listOf(7, 2, 5, 8, 1, 4, 3, 6)

    val sortedNums = nums.sortedWith(
        compareBy <Int> { it%2  }
            .thenBy { it }
    )
    println(sortedNums)

    }


