package org.example

const val MAX_ATTEMPTS = 3

fun main() {
    var attempts = 0

    println("Добро пожаловать! Пройдите проверку.")
    println("Докажите что вы не бот. У вас есть $MAX_ATTEMPTS попытки.")

    while (attempts < MAX_ATTEMPTS) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()

        println("$number1 + $number2 = ")


        val sum = readln().toInt()
        if (sum == number1 + number2) {
            println("Добро пожаловать!")
            break
        }
        attempts++
        println("Неверно! Осталось попыток: ${MAX_ATTEMPTS - attempts}")
    }
    if (attempts == MAX_ATTEMPTS) {
        println("Доступ запрещен")
    }
}