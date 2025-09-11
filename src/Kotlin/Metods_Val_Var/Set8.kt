fun main() {

    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(4, 5, 6, 7, 8)

    println(list1.toSet().intersect(list2.toSet()))


    val text = "cat dog cat bird dog fish"

    val text2 = text.split(' ').toSet()

    println("Количество уникальных слов: ${text2.size}")


    val a = setOf("java", "kotlin", "python")
    val b = setOf("c++", "kotlin", "go")

    println(a.intersect(b).isNotEmpty())


    val a1 = setOf(1, 2, 3, 4)
    val b2 = setOf(3, 4, 5, 6)

    println((a1 subtract b2) union (b2 subtract a1))


    val friendsA = setOf("Иван", "Петя", "Саша", "Маша")
    val friendsB = setOf("Саша", "Катя", "Иван", "Олег")

    println(friendsA.intersect(friendsB))

    val ids = listOf(101, 102, 103, 101, 104, 102, 105)

    println("Уникальные IDs: ${ids.toSet().size}")

    val s1 = "kotlin"
    val s2 = "android"

    println(s1.toSet().intersect(s2.toSet()))





}