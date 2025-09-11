fun main() {
    val people: List<Pair<String, Int>> = listOf(
        "Alice" to 25,
        "Bob" to 30,
        "Charlie" to 28
    )


    for ((name, age) in people) {
        println("Name: $name -> age: $age")
    }


    val input = "x=10,y=20"

    val str = input.split(Regex(","))
        .map {
            val (key, value) = it.split("=")
            key to value.toInt()
        }
    println(str)


    val input1 = "x=10,y=20,z=30"

    val str1 = input1.split(Regex(","))
        .map {
            val (key, value) = it.split("=")
            key to value.toInt()
        }


    println(str1.sumOf { it.second })

    val input3 = "x=10,y=20,x=15,z=30"

    val str3 = input3.split(Regex(","))
        .map {
            val (key, value) = it.split("=")
            key to value.toInt()
        }

    val res = str3.groupBy { it.first}
        .mapValues { entry -> entry.value.sumOf { it.second }
        }

    println(res)

}
