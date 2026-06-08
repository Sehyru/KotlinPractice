package org.example

fun main() {
    var correctCode = (1000..9999).random()
    println("Ваш код авторизации: $correctCode")

    do {
        print("Введите код авторизации: ")
        val inputCode = readln().toInt()

        if (inputCode == correctCode) {
            println("Добро пожаловать!")
            break
        }

        correctCode = (1000..9999).random()
        println("Неверный код. Ваш новый код авторизации: $correctCode")
    } while (true)
}