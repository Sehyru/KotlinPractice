package org.example

const val FAVORABLE_HUMIDITY: Int = 20
const val FAVORABLE_SEASON: String = "зима"

fun main() {
    val isSunny: Boolean = true
    val isTentOpen: Boolean = true

    val isConditionsFavorable = isSunny && isTentOpen && (FAVORABLE_HUMIDITY == 20) && (FAVORABLE_SEASON != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionsFavorable")
}