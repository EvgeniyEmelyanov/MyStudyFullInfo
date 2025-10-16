
fun square1(num: Int): Int {
    return num*num
}

fun greet1(name: String = "Guest"): String {
    return "Hello, $name"
}

fun formatName(first: String, last: String, showLastFirst: Boolean): String {
    if (showLastFirst == true) {
        return "$last, $first"
    } else {
        return "$first, $last"
    }
}


fun main() {
    val name = "Evgeniy"
    var age = 27
    var boolean = true

    println("My name is $name. I'm $age years old. Learning Kotlin: $boolean")


    var nickname: String?
    nickname = null
    println(nickname?.length?: "zalypa")

    println(square1(age))
    println(square1(22))
    println(square1(2))


    println(greet1(name))
    println(greet1())
   println(formatName(name, "Emel",true))
    println(formatName(name, "Emel",false ))
}

