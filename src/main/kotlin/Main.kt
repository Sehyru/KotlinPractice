package org.example

fun main() {
    val digits = '0'..'9'
    val letters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'
    val allChars = digits + letters + uppercaseLetters

    var passwordSize: Int

    do {
        print("Задайте длину пароля (минимум 6): ")
        passwordSize = readln().toInt()

        if (passwordSize < 6) println("Введите число не меньше 6.")
    } while (passwordSize < 6)

    val password = mutableListOf(
        digits.random(),
        letters.random(),
        uppercaseLetters.random()
    )

    for (i in 4..passwordSize) {
        password.add((allChars).random())
    }

    password.shuffle()

    println(password.joinToString(""))
}