package org.example

import kotlin.math.roundToInt
import kotlin.random.Random

class WeatherKelvin(dayTempK: Int, nightTempK: Int, hasPrecipitation: Boolean) {

    var dayTempC: Int = dayTempK - 273
    var nightTempC: Int = nightTempK - 273
    var precipitation: Boolean = hasPrecipitation

    init {
        printInfo()
    }

    fun printInfo() {
        val precipitationText = if (precipitation) "да" else "нет"
        println("Температура днем: $dayTempC°C, температура ночью: $nightTempC°C, осадки: $precipitationText")
    }
}

fun main() {
    val weatherList = mutableListOf<WeatherKelvin>()
    for (i in 1..30) {
        val dayTempK = Random.nextInt(270, 290)
        val newDay = WeatherKelvin(
            dayTempK,
            Random.nextInt(250, dayTempK + 1),
            Random.nextBoolean()
        )
        weatherList.add(newDay)
    }
    val dayTemp = weatherList.map { it.dayTempC }
    val nightTemp = weatherList.map { it.nightTempC }
    val averDayTemp =  dayTemp.average().roundToInt()
    val averNightTemp =  nightTemp.average().roundToInt()
    val precipitationTrue = weatherList.count { it.precipitation }
    println("Средняя дневная температура за месяц: $averDayTemp°C")
    println("Средняя ночная температура за месяц: $averNightTemp°C")
    println("Количество дней с осадками: $precipitationTrue")
}