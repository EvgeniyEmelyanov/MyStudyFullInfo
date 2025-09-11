fun main() {
    val nums = mutableListOf(1, 2, 3)


    nums.add(4)
    nums.remove(2)
    nums.set(0, 100)

    println(nums) // ожидаемый результат: [100, 3, 4]

    val phoneBook = mutableMapOf(
        "Alice" to "+123",
        "Bob" to "+456"
    )

    phoneBook["Charlie"] = "+789"

    phoneBook["Alice"] = "+111"

    phoneBook.remove("Bob")

    for ((key, value) in phoneBook) {
        println("Name $key -> phone $value")
    }

    val capitals = mapOf(
        "France" to "Paris",
        "Germany" to "Berlin"
    )

    println(capitals.containsKey("France"))
    println(capitals.containsKey("Minsk"))

    val phoneBook1 = mapOf(
        "Alice" to "+123",
        "Bob" to "+456"
    )


    print("Введите имя: ")
    val checkName = readLine().toString().trim()

    if (phoneBook1.containsKey(checkName)) {
        println("Phone number: ${phoneBook1[checkName]}")
    } else {
        println("There is no such phone number")
    }

    if (phoneBook1.containsValue("+111")){
        println("There is such phone number")
    } else {
        println("There is no such phone number")
    }

    // TODO: проверь наличие ключа "Alice"
    // TODO: выведи её телефон, если он есть
    // TODO: проверь наличие значения "+111"
}

val name = readLine()?.trim() ?: ""
