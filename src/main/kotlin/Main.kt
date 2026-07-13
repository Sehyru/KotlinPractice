package org.example

class WeatherReport(var dayTemp: Int, var nightTemp: Int, var precipitation: Boolean) {

    init {
        if(precipitation && dayTemp < 5) {
            println("Внимание: возможен гололёд или снег!")
        }
        if(dayTemp - nightTemp > 15) {
            println("Большой перепад температур днём и ночью!")
        }
    }

    fun printInfo() {
        val precipitationText = if(precipitation) "да" else "нет"
        println("Температура днем: $dayTemp, температура ночью: $nightTemp, осадки: $precipitationText")
    }
}

fun main() {
    val day1 = WeatherReport(3, -6, true)
    day1.printInfo()

    val day2 = WeatherReport(20, 2, false)
    day2.printInfo()
}