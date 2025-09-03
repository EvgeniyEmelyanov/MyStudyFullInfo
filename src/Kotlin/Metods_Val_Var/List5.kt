fun main() {
    val nums = listOf(1, 2, 3, 4, 5)

    var sum = 0

    for (item in nums) {
        sum += item
    }
    println(sum)

    println(nums.sum())
    println(nums.average())
    println(nums.minOrNull())
    println(nums.maxOrNull())

}
