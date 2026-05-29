package org.example

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {

    val today = LocalDate.now()
    val currentYear = today.year

    println("Введите ваш год рождения:")
    val userBirthYearInput = readln().toIntOrNull()

    if (userBirthYearInput == null) {
        println("Ошибка: введите корректный год рождения.")
        return
    }

    if (userBirthYearInput > currentYear) {
        println("Ошибка: год рождения не может быть больше текущего $currentYear года.")
        return
    }

    val userAge = currentYear - userBirthYearInput

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }
}