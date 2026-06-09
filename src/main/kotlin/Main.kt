package org.example

fun main() {
    println("Введите любое число: ")
    val inputNumber = readln().toInt()

    for(n in 0..inputNumber step 2) {
        println(n)
    }
}