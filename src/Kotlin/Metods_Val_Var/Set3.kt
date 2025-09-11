
fun main() {
    val a = setOf(1, 2, 3)
    val b = setOf(3, 4, 5)


    val un = a.union(b)
    var inter = a.intersect(b)
    var sub = a.subtract(b)

    println(un)
    println(inter)
    println(sub)





}