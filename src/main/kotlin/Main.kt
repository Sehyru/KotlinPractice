package org.example

fun main() {
    println("Введите количество секунд которые надо засечь: ")
    val inputSeconds = readln().toInt()

    for (sec in inputSeconds downTo 1) {
        println(sec)
        Thread.sleep(1000)
    }
    println("Время вышло")
}