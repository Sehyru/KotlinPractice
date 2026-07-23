package org.example

class ContactError(val name: String, val phone: Long)

fun main() {
    println("Введите номер телефона: ")
    val input = readln()

    input.toLongOrNull()?.let {
        println("Номер телефона: $it")
    } ?: println("Ошибка: введено не число")
}