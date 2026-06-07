package org.example

fun main() {
    var attempts = 0
    var success = false

    println("Добро пожаловать! Пройдите проверку.")

    while (attempts < 3 && !success) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()

        println("Докажите что вы не бот, сложите два числа $number1 и $number2. У вас есть ${3 - attempts} попытки.")
        println("$number1 + $number2 = ")

        val sum = readln().toInt()
        attempts++

        if (sum != number1 + number2) {
            println("Неверно! Осталось попыток: ${3 - attempts}")
            continue
        }

        success = true
    }

    if (success) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }
}