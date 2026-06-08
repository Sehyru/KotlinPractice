package org.example

fun main() {
    var correctCode = (1000..9999).random()

    println("Ваш код авторизации: $correctCode")
    for (sec in 60 downTo 1) {

        println("Введите код авторизации: ")
        val inputCode = readln().toInt()
        if (inputCode == correctCode) {
            println("Добро пожаловать!")
            break
        }
        correctCode = (1000..9999).random()
        println("Осталось $sec секунд")
        println("Неверный код. Ваш новый код авторизации: $correctCode")
    }
}