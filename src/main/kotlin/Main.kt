package org.example

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2026
    println("Введите ваш год рождения:")
    val userBirthYearInput = readln().toInt()
    val userAge = currentYear - userBirthYearInput

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }
}