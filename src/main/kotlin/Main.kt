package org.example
const val TOTAL_TABLES = 13
fun main() {

    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    val isAvailableToday: Boolean = bookedTablesToday < TOTAL_TABLES
    val isAvailableTomorrow: Boolean = bookedTablesTomorrow < TOTAL_TABLES

    println("[Доступность столиков на сегодня: $isAvailableToday], \n[Доступность столиков на завтра: $isAvailableTomorrow]")

}