package org.example

fun generatePassword(length: Int): String {
    val digits = "0123456789"
    val specials = "!\"#\$%&'()*+,-./ "
    return (0 until length).map { i -> if (i % 2 == 0) digits.random() else specials.random() }.joinToString("")
}

fun main() {
    println("Введите длину пароля: ")
    val length = readln().toInt()
    val password = generatePassword(length)
    println("Сгенерирорванный пароль: $password")
}