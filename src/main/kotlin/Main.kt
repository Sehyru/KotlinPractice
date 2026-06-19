package org.example

fun main() {
    val ingredients = mutableListOf("Мука", "Сахар", "Яйцо")
    println("В рецепте есть базовые ингредиенты: $ingredients")
    println("Желаете добавить еще?")

    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln())
    } else return

    println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
}