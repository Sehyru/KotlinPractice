package org.example

fun main() {
    println("Введите количество ингредиентов: ")
    val size = readln().toInt()
    val ingredients = Array(size) { "" }

    for ((index, _) in ingredients.withIndex()) {
        println("Введите ингредиент ${index + 1}: ")
        ingredients[index] = readln()
    }
    println(ingredients.joinToString())
}