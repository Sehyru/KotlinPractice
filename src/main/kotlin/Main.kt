package org.example

fun main() {
    val ingredients = listOf("Яйца", "Молоко", "Сливочное масло")
    val count = listOf(2, 50, 15)

    println("Введите количество порций: ")
    val userInput = readln().toInt()

    println(
        "На $userInput порций вам понадобиться: ${
            ingredients.mapIndexed { index, string ->
                "$string-${count[index] * userInput}"
            }.joinToString(", ")
        }"
    )
}