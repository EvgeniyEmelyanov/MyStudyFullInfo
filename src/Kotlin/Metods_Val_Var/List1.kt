fun main() {
    val num = listOf(1, 2, 3, 4, 5)

    var sum = 0

    for (i in num) {
        sum += i
        println(i)
    }
    println(sum)
}