package org.example

fun main() {

    println("Введите наличие повреждений корпуса (true — есть повреждения, false — нет повреждений):")
    val isHullDamaged = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toInt()

    println("Введите количество ящиков с провизией на борту:")
    val provision = readln().toInt()

    println("Введите благоприятность метеоусловий (true - благоприятная, false - неблагоприятная):")
    val isWeatherSafe = readln().toBoolean()

    val hasEnoughCrew = crew in 55..70
    val hasSufficientProvision = provision > 50
    val hasRecommendedCrew = crew == 70
    val hasMinimumProvision = provision >= 50


    val canDepartLongVoyage =
        (!isHullDamaged && hasEnoughCrew && hasSufficientProvision && (isWeatherSafe || !isWeatherSafe)) ||
                ((isHullDamaged || !isHullDamaged) && hasRecommendedCrew && isWeatherSafe && hasMinimumProvision)

    if (canDepartLongVoyage) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}