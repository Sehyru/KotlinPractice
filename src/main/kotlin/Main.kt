package org.example

class WeatherKelvin(dayTempK: Int, nightTempK: Int, hasPrecipitation: Boolean) {

    var dayTempC: Int = dayTempK - 273
    var nightTempC: Int = nightTempK - 273
    var precipitation: Boolean = hasPrecipitation

    init {
        printInfo()
    }

    fun printInfo() {
        val precipitationText = if(precipitation) "да" else "нет"
        println("Температура днем: $dayTempC°C, температура ночью: $nightTempC°C, осадки: $precipitationText")
    }
}

fun main() {
    val day1 = WeatherKelvin(300, 280, true)
    val day2 = WeatherKelvin(283, 268, false)
}