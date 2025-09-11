fun main() {

    val text: String = "Kotlin is fun and Kotlin is powerful and simple"

    val newText = text.lowercase().split(' ').toSet()

    println("Количество уникальных слов: ${newText.size} ($newText)")


    val user1Friends = setOf("Иван", "Петя", "Маша", "Саша", "Олег")
    val user2Friends = setOf("Маша", "Олег", "Катя", "Лена", "Иван")

    println(user1Friends.intersect(user2Friends))
    println((user1Friends subtract user2Friends) union (user2Friends subtract user1Friends))
    println(user1Friends.intersect(user2Friends).size)


}