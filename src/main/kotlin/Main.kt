package org.example

fun main() {
    val digits = '0'..'9'
    val letters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'

    var passwordSize: Int

    do {
        print("Задайте длину пароля (минимум 6): ")
        passwordSize = readln().toInt()

        if (passwordSize < 6) println("Введите число не меньше 6.")
    } while (passwordSize < 6)

    var password = ""

    for (i in 1..passwordSize) {
        password += when (i % 3) {
            0 -> digits.random()
            1 -> letters.random()
            else -> uppercaseLetters.random()
        }
    }
    println(password)
}