package org.example

fun main() {
    println("Добро пожаловать! Вы выбрали регистрацию.")
    println("Создайте логин: ")
    val registeredLogin = readln()

    println("Создайте пароль: ")
    val registeredPassword = readln()

    println("Регистрация завершена! Теперь войдите в приложение!")

    var isAuthorized = false

    while (!isAuthorized) {
        println("Введите логин: ")
        val inputLogin = readln()

        println("Введите пароль: ")
        val inputPassword = readln()

        if (inputLogin == registeredLogin && inputPassword == registeredPassword) {
            isAuthorized = true
            println("Авторизация прошла успешно")
        } else
            println("Неверный логин и пароль. Попробуйте еще раз.")
    }
}