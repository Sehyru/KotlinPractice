package org.example

const val FAVORABLE_HUMIDITY = 20
const val FAVORABLE_SEASON = "не зима"

fun main() {

    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val currentHumidity: Int = 20
    val currentSeason: String = "зима"

    val isConditionsFavorable =
        isSunny && isTentOpen && (currentHumidity == FAVORABLE_HUMIDITY) && (currentSeason == FAVORABLE_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionsFavorable")
}