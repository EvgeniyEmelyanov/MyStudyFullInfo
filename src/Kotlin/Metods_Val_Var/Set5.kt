fun main() {

    val a = setOf(1, 2, 3)
    val b = setOf(1, 2, 3, 4, 5)

    var contain = a.all { it in b }

    println(contain)
}