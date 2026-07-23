package org.example

class ContactError(val name: String, val phone: Long)

fun main() {
    println("Введите номер телефона: ")
    val input = readln()

    try {
        input.toLong().let {
            println("Номер телефона: $it")
        }
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
    }
}