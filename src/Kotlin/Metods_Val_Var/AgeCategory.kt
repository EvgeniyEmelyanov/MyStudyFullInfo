fun main() {
    print("Введите возраст: ")
    val age = readln().toInt()


    val category = when (age) {
        in 0..12 -> "Ребёнок"
        in 13..17 -> "Подросток"
        in 18..64 -> "Взрослый"
        in 65..100 -> "Пожилой"
        else -> "Ошибка ввода"
    }

    println(category)

}
