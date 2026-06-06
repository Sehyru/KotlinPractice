package org.example

fun main() {
    val number = (1..9).random()
    var attempt = 5

    println("Добро пожаловать в игру «Угадай число»!")
    println("Я загадал число от 1 до 9. У вас есть $attempt попыток, чтобы его угадать.")

    while (attempt > 0) {
        println("Введите ваше число: ")
        val userNumber = readln().toInt()

        if (userNumber == number) {
            break
        }

        attempt--

        if (attempt > 0) {
            println("Неверно! Осталось попыток: $attempt")
        }
    }

    if (attempt > 0) {
        println("Это была великолепная игра!")
    } else {
        println("Было загадано $number")
    }
}