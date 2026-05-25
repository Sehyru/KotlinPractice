package org.example

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    var weight = 20
    var volume = 80

    println("Груз с весом $weight кг и объёмом $volume л соответствует категории 'Average': ${(weight > minWeight) && (weight <= maxWeight) && (volume < maxVolume)}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объёмом $volume л соответствует категории 'Average': ${(weight > minWeight) && (weight <= maxWeight) && (volume < maxVolume)}")
}