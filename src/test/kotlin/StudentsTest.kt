import org.junit.Assert.*
import org.junit.Test
import tasks.Student
import tasks.averageGrade
import tasks.highestAverageGrade

class StudentsTest {
    @Test
    fun testAverageGrade() {
        val students = listOf(
            Student("Alice", listOf(8, 9, 7)),
            Student("Bob", listOf(7, 8, 9)),
            Student("Charlie", listOf(9, 8, 10))
            // Добавьте еще студентов по вашему усмотрению
        )

        val result = averageGrade(students)

        assertEquals(8.00, result["Alice"])
        assertEquals(8.00, result["Bob"])
        assertEquals(9.00, result["Charlie"])
    }

    @Test
    fun testHighestAverageGrade() {
        val students = listOf(
            Student("Alice", listOf(8, 9, 7)),
            Student("Bob", listOf(7, 8, 9)),
            Student("Charlie", listOf(9, 8, 10))
            // Добавьте еще студентов по вашему усмотрению
        )

        val result = highestAverageGrade(students)

        assertEquals("Charlie", result)
    }
}