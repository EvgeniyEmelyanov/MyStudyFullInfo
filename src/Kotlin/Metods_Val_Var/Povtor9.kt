data class Person(val name: String, val age: Int)
data class Product(val name: String, val price: Int)
data class Student1(val name: String, val course: Int, val age: Int)
data class Book1(val title: String, val author: String, val genre: String)


fun main() {
    val people = listOf(
        Person("Bob", 25),
        Person("Alice", 30),
        Person("Charlie", 25)
    )

    val sort = people.sortedWith(
        compareBy { person: Person -> person.age }
            .thenBy { person: Person -> person.name }
    )
    for (person in sort) {
        println("${person.name}-> ${person.age}")
    }

    val words = listOf("java", "cat", "kotlin", "hi", "dog")

    val sorted = words.sortedWith(
        compareByDescending { it: String -> it.length }
            .thenBy { it: String -> it }
    )
    for (word in sorted) {
        println(word)
    }

    val products = listOf(
        Product("Milk", 50),
        Product("Bread", 30),
        Product("Butter", 50),
        Product("Apple", 30)
    )

    val sortedProducts = products.sortedWith(
        compareBy<Product> { it.price }
            .thenBy { it.name }
    )

    for (product in sortedProducts) {
        println("${product.name} -> ${product.price}")
    }

    val students = listOf(
        Student1("Alice", 2, 20),
        Student1("Bob", 1, 19),
        Student1("Charlie", 2, 19),
        Student1("Dave", 1, 20)
    )

    val sortedStudents = students.sortedWith(
        compareBy<Student1> { it.course }
            .thenBy { it.age }
            .thenBy { it.name }
    )

    for (student in sortedStudents) {
        println("${student.name} -> ${student.course} -> ${student.age}")
    }

    val books = listOf(
        Book1("The Hobbit", "Tolkien", "Fantasy"),
        Book1("The Fellowship of the Ring", "Tolkien", "Fantasy"),
        Book1("Effective Java", "Bloch", "Programming"),
        Book1("Clean Code", "Martin", "Programming"),
        Book1("Harry Potter", "Rowling", "Fantasy"),
        Book1("Kotlin in Action", "Jemerov", "Programming")
    )

    val sortedBooks = books.sortedWith(
        compareByDescending<Book1> { it.genre }
            .thenBy { it.author }
            .thenBy { it.title }
    )

    for (book in sortedBooks) {
        println("Title: ${book.title}, author: ${book.author}, genre: ${book.genre}")
    }

}
