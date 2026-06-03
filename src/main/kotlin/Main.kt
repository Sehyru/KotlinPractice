package org.example

fun main() {
    println("Введите количество секунд: ")
    val seconds = readln().toInt()

    var count = seconds
    while (count > 0) {
        Thread.sleep(1000)
        count--
    }
    println("Прошло $seconds секунд")
}