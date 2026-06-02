package org.example

fun main() {
    println("Добро пожаловать! Вы выбрали регистрацию.")
    println("Создайте логин: ")
    val registeredLogin = readln()

    println("Создайте пароль: ")
    val registeredPassword = readln()

    println("Регистрация завершена! Теперь войдите в приложение!")

    var inputLogin: String
    var inputPassword: String

    do {
        print("Введите логин: ")
        inputLogin = readln()

        print("Введите пароль: ")
        inputPassword = readln()

    } while (inputLogin != registeredLogin || inputPassword != registeredPassword)
    println("Авторизация прошла успешно")
}
