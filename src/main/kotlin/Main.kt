package org.example

fun validateLogin(login: String, password: String): Boolean {
    return login.length >= 4 && password.length >= 4
}

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    val isValid = validateLogin(login, password)

    if (isValid) {
        println("Добро пожаловать!")
    } else println("Логин или пароль недостаточно длинные")
}