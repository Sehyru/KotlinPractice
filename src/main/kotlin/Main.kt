package org.example

fun main() {
    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "зима"

    val isConditionsFavorable = isSunny && isTentOpen && (humidity == 20) && (currentSeason != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionsFavorable")
}