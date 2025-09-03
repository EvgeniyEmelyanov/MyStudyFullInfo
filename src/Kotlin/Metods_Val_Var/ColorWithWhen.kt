fun main() {

    while (true) {
        print("Введите цвет светофора (red, yellow, green) или stop, чтобы выйти)): ")
        val color = readln()
        val result = when (color) {
            "red" -> "Стой!"
            "yellow" -> "Жди!"
            "green" -> "Иди!"
            "stop" ->  return
            else -> "Неверный цвет"
        }
        println(result)
    }


}
