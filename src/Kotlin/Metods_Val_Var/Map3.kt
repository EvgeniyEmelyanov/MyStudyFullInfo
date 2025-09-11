fun main() {
    val ages = mapOf("Alice" to 20, "Bob" to 25, "Carol" to 22)

    for ((name, age) in ages) {
        println("$name, $age")
    }

    for (name in ages.keys){
        println(name)
    }

    for (age in ages.values){
        println(age)
    }

    for (entry in ages.entries){
        println("${entry.key} -> ${entry.value}")
    }

    ages.forEach { (name, age) -> println("$name, $age") }



    for ((key, value) in ages){
        println("$key -> $value")
    }

    for (key in ages.keys){
        println(" $key")
    }

    for (value in ages.values){
        println("$value")
    }


}



