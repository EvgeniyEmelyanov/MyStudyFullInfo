fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7)


    println(nums.take(3))
    println(nums.drop(4))
    println(nums.takeWhile { it < 5 })
    println(nums.dropWhile { it < 5 })
    println(nums.chunked(3))
    println(nums.windowed(3, 1))

}
