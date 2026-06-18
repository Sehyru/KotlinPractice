package org.example

fun main() {
    val ingredients = listOf("Мука", "Яйца", "Молоко")
    println("В рецепте есть следующие ингредиенты: $ingredients")
    for (ingredient in ingredients) {
        println(ingredient)
    }
}