package org.example

fun main() {

    val winningNumbers = listOf(
        (0..42).random(),
        (0..42).random(),
        (0..42).random()
    )

    println("Добро пожаловать в улучшенную лотерею!")
    println("Попробуйте угадать три числа от 0 до 42.")
    println("Введите ваши числа по очереди: ")

    val userNumbers = listOf(
        readln().toInt(),
        readln().toInt(),
        readln().toInt()
    )

    val matches = winningNumbers.intersect(userNumbers)
    val countMatches = matches.size

    when (countMatches) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз.")
        1 -> println("Вы угадали одно число, выплачивается утешительный приз.")
        0 -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winningNumbers")
}