package org.example

const val NUMBER_MIN = 0
const val NUMBER_MAX = 42
const val FIRST_WINNING_NUMBER = 37
const val SECOND_WINNING_NUMBER = 11

fun main() {

    println("Добро пожаловать в лотерею!")
    println("Попробуйте угадать два числа от $NUMBER_MIN до $NUMBER_MAX.")
    println("Введите ваши числа по очереди")

    print("Первое число: ")
    val firstUserInput = readln().toInt()

    print("Второе число: ")
    val secondUserInput = readln().toInt()

    val bothCorrect =
        (firstUserInput == FIRST_WINNING_NUMBER && secondUserInput == SECOND_WINNING_NUMBER) || (firstUserInput == SECOND_WINNING_NUMBER && secondUserInput == FIRST_WINNING_NUMBER)
    val oneCorrect =
        (firstUserInput == FIRST_WINNING_NUMBER || secondUserInput == SECOND_WINNING_NUMBER) || (firstUserInput == SECOND_WINNING_NUMBER || secondUserInput == FIRST_WINNING_NUMBER)

    val result =
        if (bothCorrect) "Поздравляем! Вы выиграли главный приз!" else if (oneCorrect) "Вы выиграли утешительный приз!" else "Неудача!"
    println(result)
}