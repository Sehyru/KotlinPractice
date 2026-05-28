package org.example

import kotlin.random.Random

fun main() {

    val num1 = Random.nextInt(1, 101)
    val num2 = Random.nextInt(1, 101)
    val result = num1 + num2

    println("Подтвердите, что вы не робот, сложите два числа: $num1 и $num2")

    val userAnswer = readln().toIntOrNull()

    if (userAnswer == result) println("Добро пожаловать!") else println("Доступ запрещен.")
}