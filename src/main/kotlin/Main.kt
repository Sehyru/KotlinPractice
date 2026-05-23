package org.example

fun main() {
    val move = "D2-D4;0"
    val split = move.split("-", ";")
    val moveFrom = split[0]
    val moveWhere = split[1]
    val moveNumber = split[2]

    println(moveFrom)
    println(moveWhere)
    println(moveNumber)
}