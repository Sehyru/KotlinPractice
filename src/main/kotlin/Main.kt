package org.example

fun main() {
    var moveFrom = "E2"
    var moveWhere = "E4"
    var numberMove = 1
    var move = "$moveFrom-$moveWhere, $numberMove"
    println(move)

    moveFrom = "D2"
    moveWhere = "D1"
    numberMove = 2
    move = "$moveFrom-$moveWhere, $numberMove"
    println(move)
}