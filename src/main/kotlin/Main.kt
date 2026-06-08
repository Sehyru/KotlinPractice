package org.example

fun main() {
    var correctCode: Int
    var inputCode: Int

    do {
        correctCode = (1000..9999).random()
        println("Ваш код авторизации: $correctCode")

        print("Введите код авторизации: ")
        inputCode = readln().toInt()

        if (inputCode != correctCode) {
            println("Неверный код.")
        }
    } while (inputCode != correctCode)

    println("Добро пожаловать!")
}