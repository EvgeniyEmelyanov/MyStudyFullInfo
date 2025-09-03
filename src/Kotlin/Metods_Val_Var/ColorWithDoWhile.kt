fun main() {
    var color: String

    do {
        print("Введите цвет светофора (red, yellow, green) или stop, чтобы выйти: ")
        color = readln()

        val result = when (color) {
            "red" -> "Стой!"
            "yellow" -> "Жди!"
            "green" -> "Иди!"
            "stop" -> {
                println("Вы вышли из программы")
                "Программа завершена" // временное значение, оно не выводится
            }
            else -> "Неверный цвет"
        }

        if (color != "stop") {
            println(result)
        }
    } while (color != "stop")
}
