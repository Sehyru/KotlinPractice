package org.example

fun main() {
    println("Составим список ингредиентов для блюда. Введите 5 уникальных ингредиентов.")
    val ingredients = mutableListOf<String>()

    while (ingredients.size < 5) {
        println("Ингредиент ${ingredients.size + 1} из 5:")
        val ingredient = readln()
        if (ingredients.contains(ingredient)) {
            println("«$ingredient» уже в списке. Введите другой ингредиент:")
        } else ingredients.add(ingredient)
    }

    val sortedIngredients = ingredients.sorted()
    val result = sortedIngredients.joinToString(", ")
    println("Ваши ингредиенты: ${result.replaceFirstChar { it.uppercase() }}")
}