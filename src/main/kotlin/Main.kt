package org.example

fun main() {
    println("Напишите пять названий ингредиентов для блюда в одной строке через запятую с пробелом:")
    val ingredients = readln().split(", ")
    val sortedIngredients = ingredients.sorted()
    println(sortedIngredients)
}