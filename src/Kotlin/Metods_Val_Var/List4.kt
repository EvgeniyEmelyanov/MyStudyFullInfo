fun main() {
    val names = listOf("Alice", "Bob", "Carol")

    for (name in names) {
        println(name)
    }

    for (i in names.indices) {
        println("Index: $i -> ${names[i]}")
    }

    for ((i, name) in names.withIndex()) {
        println("$i -> $name")
    }
}
