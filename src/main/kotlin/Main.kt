package org.example

fun main() {
    val ingredients = arrayOf("Картофель", "Сосиски", "Помидор", "Твердый сыр", "Сметана", "Соль")

    println("Напишите ингридиент который хотите найти: ")
    val userRequest = readln()

    var found = false

    for (ingredient in ingredients) {
        if (ingredient == userRequest) {
            found = true
            break
        }
    }
    if (found) println("Ингредиент $userRequest в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}