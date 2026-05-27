package org.example

fun main() {

    val day = 5
    val isOddDay = day % 2 != 0

    val isExercisesArms = isOddDay
    val isExercisesLegs = !isOddDay
    val isExercisesBack = !isOddDay
    val isExercisesAbs = isOddDay

    println("Упражнение для рук: $isExercisesArms\n" +
            "Упражнение для ног: $isExercisesLegs\n" +
            "Упражнение для спины: $isExercisesBack\n" +
            "Упражнение для пресса: $isExercisesAbs")
}