fun main() {
    val capitals = mapOf(
        "RU" to "Moscow",
        "FR" to "Paris",
        "JP" to "Tokyo"
    )

    println(capitals["RU"])
    println(capitals.getOrDefault("DE", "N/A"))
    println(capitals.getOrElse("IT") { "Unknown" })
    println(capitals.containsKey("FR"))
    println(capitals.containsValue("Paris"))


    val rates = mapOf("USD" to 97, "EUR" to 104).withDefault {  key -> "Unknown-$key" }


    println(rates.getValue("USD"))
    println(rates.getValue("GBP"))


    // TODO: вызови getValue("USD") и распечатай
    // TODO: вызови getValue("GBP") и распечатай (должен вернуться -1, не упасть)


}
