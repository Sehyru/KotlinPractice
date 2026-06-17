package org.example

fun main() {
    val ingredients = arrayOf("Картофель", "Сосиски", "Помидор", "Твердый сыр", "Сметана", "Соль")

    println("Список ингредиентов: ${ingredients.joinToString()}")
    println("Выберите ингредиент который хотите заменить: ")
    val selectedIngredient = readln()

    if (ingredients.contains(selectedIngredient)) {
        println("Добавьте новый ингредиент вместо ранее выбранного: ")
        val addedIngredient = readln()

        val index = ingredients.indexOf(selectedIngredient)
        ingredients[index] = addedIngredient
        println("Готово! Вы сохранили следующий список ингредиентов: ${ingredients.joinToString()}")
    }
    else println("Такого ингредиента в списке нет")
}