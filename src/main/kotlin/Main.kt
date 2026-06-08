package org.example

import kotlin.random.Random

fun main() {
    val digits = "0123456789"
    val letters = "abcdefghijklmnopqrstuvwxyz"

    var password = ""

    for (i in 1..6) {
        password += if (i % 2 == 0) digits[Random.nextInt(digits.length)]
        else letters[Random.nextInt(letters.length)]
    }

    println(password)
}