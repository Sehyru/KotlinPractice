package org.example

fun rollDice(): Int {
    return (1..6).random()
}

fun main() {
    val rollPlayer = rollDice()
    println("Ход игрока: выпало $rollPlayer")

    val rollComputer = rollDice()
    println("Ход компьютера: выпало: $rollComputer")

    if (rollPlayer > rollComputer) {
        println("Победило человечество")
    } else if (rollPlayer < rollComputer) {
        println("Победила машина")
    } else println("Победила дружба")
}