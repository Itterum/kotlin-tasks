package tasks

fun calculateSumAndProduct(numbers: List<Int>): Pair<Int, Int> {
    val sum = numbers.sum()
    val product = numbers.reduce { acc, i -> acc * i }

    return Pair(sum, product)
}