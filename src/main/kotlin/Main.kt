package org.example

fun main() {

    val num1 = 24
    val num2 = 12
    val result = num1 + num2

    println("Сколько будет $num1 + $num2 = ?")

    val userAnswer = readln().toIntOrNull()

    if (userAnswer == result) println("Добро пожаловать!") else println("Доступ запрещен.")
}