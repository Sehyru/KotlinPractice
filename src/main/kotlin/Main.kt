package org.example

fun main() {

    val day = 5
    val isEvenDay = day % 2 == 0

    println("Упражнение для рук: ${!isEvenDay}\n" +
            "Упражнение для ног: $isEvenDay\n" +
            "Упражнение для спины: $isEvenDay\n" +
            "Упражнение для пресса: ${!isEvenDay}")
}