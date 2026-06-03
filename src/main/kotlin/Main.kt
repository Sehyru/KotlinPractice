package org.example

fun main() {
    println("Введите количество секунд: ")
    val seconds = readln().toInt()
    var currentSecond = 0

    while (currentSecond < seconds) {
        Thread.sleep(1000)
        currentSecond++
    }
    println("Прошло $seconds секунд")
}