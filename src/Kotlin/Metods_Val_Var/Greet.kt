fun greet(name: String): String {
    return "Hello, $name"
}

fun main() {
    println(greet("Евгений")) // "Привет, Евгений"
    println(cube(2))   // 8
    println(cube(-3))  // -27
    println(cube(0))   // 0
}

fun cube(x: Int) = x * x * x



