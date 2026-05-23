package org.example

fun main() {
    var move = "D2-D4;0"
    var split = move.split("-", ";")
    var moveFrom = split[0]
    var moveWhere = split[1]
    var moveNumber = split[2]

    println(moveFrom)
    println(moveWhere)
    println(moveNumber)
}