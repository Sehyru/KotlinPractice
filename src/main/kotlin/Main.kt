package org.example

class Category {
    var cover: String = ""
    var name: String = ""
    var description: String = ""
    var recipes: MutableList<Recipe> = mutableListOf()
}

class Recipe {
    var cover: String = ""
    var name: String = ""
    var portions: Int = 1
    var ingredients: MutableList<Ingredient> = mutableListOf()
}

class Ingredient {
    var name: String = ""
    var quantity: String = ""
}

fun main() {
}