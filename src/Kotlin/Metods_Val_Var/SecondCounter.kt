fun main() {
    println("Enter your age: ")
    val age = readln().toInt()

    var days = age*365
    var clock = days*24
    var min = clock*60
    var sec = min*60

    println("Days: $days, Clock: $clock, Min: $min, Sec: $sec")




}