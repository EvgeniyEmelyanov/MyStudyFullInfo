fun main() {
    val nums = listOf(10, 20, 30, 40)


    val first = nums.first()
    val last = nums.last()
    val num_2 = nums[2]
    val num_3 = nums.getOrNull(2)
    val num_4 = nums.getOrNull(10)



    print("$first -> $last -> $num_2 -> $num_3 -> $num_4")

    }

    // TODO: выведи первый и последний элемент
    // TODO: выведи элемент по индексу 2 двумя способами:
    //   1) nums[2]
    //   2) nums.getOrNull(2)  // безопасно, если индекса нет -> null

    // TODO: попробуй получить элемент с индексом 10 безопасно (ожидаем null)

