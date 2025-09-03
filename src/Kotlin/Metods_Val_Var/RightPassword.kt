fun main() {
    val correctPassword = "1234"
    var input: String

    do {
        print("Введите пароль: ")
        input = readln()

        if (input == correctPassword) {
            println("Доступ разрешён")
        }else {
            println("Неверный пароль, попробуйте снова")
        }

    } while (input != correctPassword)
}

