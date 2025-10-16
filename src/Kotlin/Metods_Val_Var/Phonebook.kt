import java.util.Locale

data class Contact(val name: String, val phone: String)

fun main() {
    val contacts = mutableListOf<Contact>()
    while (true) {
        showMenu()
        when (readLine()?.trim()) {
            "1" -> showAll(contacts)
            "2" -> addContact(contacts)
            "3" -> findByName(contacts)
            "4" -> removeByNumber(contacts)
            "0" -> {
                println("До встречи!")
                return
            }

            else -> println("Команда не распознана.")
        }
    }
}

fun showMenu() {
    println(
        """
        ---- PHONEBOOK ----
        1) Показать все
        2) Добавить контакт
        3) Найти по имени
        4) Удалить по номеру
        0) Выход
        Выберите пункт: 
        """.trimIndent()
    )
}

fun showAll(contacts: List<Contact>) {
    if (contacts.isEmpty()) {
        println("Contact list is empty.")
        return
    }

    val sort = contacts
        .sortedWith(
            compareBy { contacts: Contact -> contacts.name.lowercase(Locale.getDefault()) }
                .thenBy { it.phone }
        )


    println("Список контактов:")
    var i = 1
    for (contact in sort) {
        println("${i++}) ${contact.name} - ${contact.phone}")
    }

}

fun isValidPhoneNumber(phone: String) =
    phone.isNotBlank() && phone.length >= 13 &&
            (phone.first().isDigit() || phone.first() == '+')

fun addContact(contacts: MutableList<Contact>) {
    println("Input your name")

    val inputName = readLine()?.trim()

    if (inputName.isNullOrBlank()) {
        println("Имя не может быть пустым.")
        return
    }

    print("Введите номер телефона: ")
    val inputPhone = readLine()?.trim()

    if (inputPhone.isNullOrBlank()) {
        println("Телефон не может быть пустым.")
        return
    }

    if (!isValidPhoneNumber(inputPhone)) {
        println("Некорректный формат телефона.")
        return
    }

    val contact = Contact(inputName, inputPhone)
    contacts.add(contact)
    println("Контакт добавлен: ${contact.name} - ${contact.phone}")

}

fun findByName(contacts: List<Contact>) {
    println("Введите часть имени или же имя целиком")

    val finder = readLine()?.trim()

    if (finder.isNullOrBlank()) {
        println("Введите корректное имя.")
        return
    }

    val query = finder.lowercase(Locale.getDefault())

    val matches = contacts.filter { contact ->
        contact.name.lowercase(Locale.getDefault()).contains(query)
    }

    if (matches.isEmpty()) {
        println("Контакты не найдены.")
    } else {
        println("Найденные контакты:")
        matches.forEachIndexed { index, c ->
            println("${index + 1}) ${c.name} - ${c.phone}")
        }
    }
}



fun removeByNumber(contacts: MutableList<Contact>) {

    if (contacts.isEmpty()) {
        println("Список пуст.")
        return
    }

    showAll(contacts)

    print("Введите номер контакта для удаления: ")

    val delete = readLine()?.trim()

    val num = delete?.toIntOrNull() ?: 0


    if (num < 0 ) {
        contacts.removeAt(num - 1)
    }

    println("Контакт ${contacts.removeAt(num - 1)} удален")




}
// TODO:
// 1) если список пуст — вывести "Список пуст" и return
// 2) показать все с нумерацией (как в showAll)
// 3) спросить номер для удаления
// 4) проверить, что это целое число в диапазоне [1..size]
// 5) удалить (index = n-1) и подтвердить удаление
