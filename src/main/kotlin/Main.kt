package org.example

fun main() {
    println("Введите количество секунд: ")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000L)
    }
    println("Время вышло")
}