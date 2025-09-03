fun main() {
    print("Введите несколько слов через пробел: ")
    val input = readln()

    val result = input.split(" ")
    println(result)

    for (res in result) {
        println(res)
    }
}
