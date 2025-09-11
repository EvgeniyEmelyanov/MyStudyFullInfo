fun main() {
    val scores = mapOf("Ann" to 50, "Ben" to 80, "Cat" to 95, "Dan" to 40)

    println(scores.filterValues { it >= 60 }.mapValues { "passed:${it.value}" })


    val users = listOf("alex", "bob", "chris")

    val associateUsers = users.associateBy { it.first() }
    val associateUsersWithLength = users.associateWith { it.length }

    println(associateUsers)
    println(associateUsersWithLength)

    val text = "apple banana apple orange banana apple"

    val words = text.split(' ')

    val counter = words.groupingBy { it }.eachCount()
    println(counter)


    val text1 = "Apple, apple! Banana? orange, APPLE."

    val words1 = text1
        .lowercase()
        .replace(Regex("[^a-z ]"), "")   // удаляем всё, кроме латинских букв И пробелов
        .trim()
        .split(Regex("\\s+"))            // любое кол-во пробелов
        .filter { it.isNotBlank() }

    val counts = words1.groupingBy { it }.eachCount()
    println(counts)





    // ожидаем: {Ben=passed:80, Cat=passed:95}
}
