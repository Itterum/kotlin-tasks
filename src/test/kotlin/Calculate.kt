import org.junit.Assert.*
import org.junit.Test
import tasks.calculateSumAndProduct

class CalculateTest {
    private fun testing(actual: Pair<Int, Int>, expected: Pair<Int, Int>) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        println("Fixed Tests calculateSumAndProduct")
        testing(calculateSumAndProduct(listOf(2, 4, 6, 8, 10)), Pair(30, 3840))
        testing(calculateSumAndProduct(listOf(6, 2, -6, 34, 50)), Pair(86, -122400))
        testing(calculateSumAndProduct(listOf(22, -4, 46, 28, 15)), Pair(107, -1700160))
    }
}