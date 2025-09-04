fun main() {
    val prices = listOf(0, -100, 999, 2500, 1050, 500, 100000)


    println(prices.filter { it > 0 }.map { it /100.0}.filter { it >= 10.0}.sortedDescending().take(3))
    // TODO: реализуй конвейер шаг за шагом
    // Подсказка: filter → map → filter → sortedDescending → take
}
