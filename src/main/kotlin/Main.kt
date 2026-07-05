package org.example

fun rollDice(): Int {
    return (1..6).random()
}

fun playRound(): Boolean {
    val rollPlayer = rollDice()
    println("Ход игрока: выпало $rollPlayer")

    val rollComputer = rollDice()
    println("Ход компьютера: выпало: $rollComputer")

    return when {
        rollPlayer > rollComputer -> {
            println("Победило человечество")
            true
        }

        rollPlayer < rollComputer -> {
            println("Победила машина")
            false
        }

        else -> {
            println("Победила дружба")
            false
        }
    }

}

fun main() {
    var wins = 0

    do {
        val playerWon = playRound()
        if (playerWon) wins++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userAnswer = readln()
    } while (userAnswer == "Да")

    println("Игрок выиграл партий: $wins")
}