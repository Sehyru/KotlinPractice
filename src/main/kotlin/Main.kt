package org.example

class Info(val name: String, val phone: Long, val company: String? = null) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phone\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val info = Info("Ростислав", 89123456789, "Reddit")
    info.printInfo()
}