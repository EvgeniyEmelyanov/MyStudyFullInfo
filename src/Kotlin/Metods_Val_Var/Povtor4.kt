fun main() {
    val phoneBook = mapOf(
        "Alice" to "+123",
        "Bob" to "+456",
        "Charlie" to "+789"
    )


    while (true) {
        print("Enter your name or number (exit for close application): ")
        var nameOrNumber = readLine()?.trim() ?: ""

        if (nameOrNumber.isEmpty()) {
            println("Please enter your name")
            continue
        }

        if (nameOrNumber == "exit")
            break

        if (phoneBook.containsKey(nameOrNumber)) {
            println("Contact \"$nameOrNumber\" found, phone: ${phoneBook[nameOrNumber]}")
        } else {
            val foundName = phoneBook.entries.find { it.value == nameOrNumber }?.key
            if (foundName != null) {
                println("Number \"$nameOrNumber\" found, name is: $foundName")
            } else {
                println("Contact not found")
            }
        }


    }

}
