fun main() {
    val nums = listOf(5, 3, 3, 1, 4, 2, 2)

    println(nums.distinct())
    println(nums.distinct().sorted())
    println(nums.distinct().sortedDescending())

}
