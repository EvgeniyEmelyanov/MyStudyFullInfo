fun main() {
    val m = mutableListOf(1, 2, 3, 4, 5, 6)

    m.removeAll { it % 2 !=0 }
    println(m)
}
