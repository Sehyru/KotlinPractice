package org.example

class DayWeather {
    var dayTemp: Int = 20
    var nightTemp: Int = 12
    var precipitation: Boolean = false
    fun printInfo() {
        val precipitationText = if (precipitation) "да" else "нет"
        println("Температура днем: $dayTemp, температура ночью: $nightTemp, осадки: $precipitationText")
    }
}

fun main() {
    val day1 = DayWeather()
    val day2 = DayWeather()

    day1.dayTemp = 24
    day1.nightTemp = 14
    day1.precipitation = true
    day1.printInfo()

    day2.dayTemp = 18
    day2.nightTemp = 9
    day2.precipitation = true
    day2.printInfo()
}