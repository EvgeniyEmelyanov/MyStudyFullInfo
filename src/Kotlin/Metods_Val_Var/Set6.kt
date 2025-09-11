fun main() {

    val a = setOf("apple", "banana", "orange")
    val b = setOf("banana", "kiwi", "apple")

    println(a.intersect(b))
    println(a.subtract(b))
    println(b.subtract(a))

}