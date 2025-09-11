fun main() {
    val setList = mutableSetOf("apple", "banana")

    setList.add("orange")
    setList.add("apple")
    setList.remove("banana")

    println(setList)

}