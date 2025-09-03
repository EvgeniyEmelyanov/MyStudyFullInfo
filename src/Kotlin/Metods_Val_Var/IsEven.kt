fun isEven(x: Int): Boolean {
    if (x % 2 == 0) {
        return true
    } else {
        return false
    }
}

fun main() {
    println(isEven(2))   // true
    println(isEven(5))   // false
}
