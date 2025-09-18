data class Book(val title: String, val author: String, val genre: String)

fun main() {
    val books = listOf(
        Book("The Hobbit", "Tolkien", "Fantasy"),
        Book("The Fellowship of the Ring", "Tolkien", "Fantasy"),
        Book("Effective Java", "Bloch", "Programming"),
        Book("Clean Code", "Martin", "Programming"),
        Book("Harry Potter", "Rowling", "Fantasy"),
        Book("Kotlin in Action", "Jemerov", "Programming")
    )

    val sorted = books.sortedWith(
        compareBy<Book> { it.genre }   // жанр ↑
            .thenBy { it.author }      // автор ↑
            .thenBy { it.title }       // название ↑
    )

    for (book in sorted) {
        println(book)
    }


    println()

    val words = listOf("apple", "banana", "apricot", "blueberry", "avocado")

    println(words.groupBy { it.first() })

    println()

    val words2 = listOf("hi", "cat", "kotlin", "java", "dog", "ok")
    val count = words2.groupingBy { it.length }.eachCount()

    println(count)

    println()

    val words3 = listOf("apple", "banana", "apricot", "blueberry", "avocado", "dog", "cat")

    val goup = words3.groupingBy { it.first() }.eachCount()
        .toList().sortedBy { it.first }

    for ((letter, count) in goup) {
        println("$letter: $count")
    }

    println()

    val words4 = listOf("apple", "banana", "apricot", "blueberry", "avocado", "dog", "cat")

    val groups = words4.groupBy { it.first() }

    println(groups)



}
