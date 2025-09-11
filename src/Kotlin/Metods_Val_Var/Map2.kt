fun main() {
    val phone = mutableMapOf<String, String>()

    phone["Alex"] = "2222"
    phone["Jack"] = "3333"
    phone["Jan"] = "4444"
    phone["Alex"] = "4444"
    phone.putIfAbsent("Jack", "4444")
    phone.remove("Jack")
    println(phone)


    val base  = mapOf("A" to 1, "B" to 2)
    val extra = mapOf("B" to 20, "C" to 3)

    // TODO-1: сделай immutable результат: base + extra и выведи
    // ожидаем: {A=1, B=20, C=3}

    val result = base + extra
    println(result)

    val m = base.toMutableMap()
    val m1 = base.toMutableMap()
    m += extra
    println(m)

    m1 -= "A"
    println(m1)


    // TODO-2: сделай mutable копию base:
    // val m = base.toMutableMap()
    // Примени к ней: m += extra, затем m -= "A"
    // выведи результат




}
