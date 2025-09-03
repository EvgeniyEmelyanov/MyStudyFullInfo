
fun main() {
    print("Enter day: ")
    val days = readln().toInt()


    when (days) {}
    val message = when (days) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"

        else -> println("Invalid Input")
    }
    println(message)

    // TODO: используй when, чтобы вывести день недели
}
