package tasks

data class Student(val name: String, val grades: List<Int>)

fun averageGrade(students: List<Student>): Map<String, Double> {
    return students.associate { student ->
        val average = student.grades.average()
        student.name to String.format("%.2f", average).toDouble()
    }
}

fun highestAverageGrade(students: List<Student>): String {
    val averageGrades = averageGrade(students)
    return averageGrades.maxByOrNull { it.value }?.key ?: "Нет студентов"
}