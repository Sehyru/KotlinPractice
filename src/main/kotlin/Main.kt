package org.example

const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50

fun main() {

    println("Введите наличие повреждений корпуса (true — есть повреждения, false — нет повреждений):")
    val isHullDamaged = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toInt()

    println("Введите количество ящиков с провизией на борту:")
    val provision = readln().toInt()

    println("Введите благоприятность метеоусловий (true - благоприятная, false - неблагоприятная):")
    val isWeatherSafe = readln().toBoolean()

    val hasEnoughCrew = crew in CREW_MIN..CREW_MAX
    val hasSufficientProvision = provision > PROVISION_MIN
    val hasRecommendedCrew = crew == CREW_MAX
    val hasMinimumProvision = provision >= PROVISION_MIN


    val canDepartLongVoyage =
        (!isHullDamaged && hasEnoughCrew && hasSufficientProvision) ||
                (isHullDamaged && hasRecommendedCrew && isWeatherSafe && hasMinimumProvision)

    if (canDepartLongVoyage) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}