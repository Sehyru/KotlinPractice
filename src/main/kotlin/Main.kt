package org.example

const val PASSWORD_SIZE = 6

fun main() {
    val digits = 0..9
    val letters = 'a'..'z'

    var password = ""

    for (i in 1..PASSWORD_SIZE) {
        password += if (i % 2 == 0) digits.random()
        else letters.random()
    }

    println(password)
}