package org.example

fun main() {
    val ingredients = arrayOf("Картофель", "Сосиски", "Помидор", "Твердый сыр", "Сметана", "Соль")

    println("Напишите ингредиент который хотите найти: ")
    val userRequest = readln()

    if (ingredients.contains(userRequest)) println("Ингредиент $userRequest в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}