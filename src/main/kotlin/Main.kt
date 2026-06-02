package org.example

fun main() {
    println("Добро пожаловать! Вы выбрали регистрацию.")
    println("Создайте логин: ")
    val registeredLogin = readln()

    println("Создайте пароль: ")
    val registeredPassword = readln()

    println("Регистрация завершена! Теперь войдите в приложение!")

    print("Введите логин: ")
    var inputLogin = readln()

    print("Введите пароль: ")
    var inputPassword = readln()

    while (inputLogin != registeredLogin || inputPassword != registeredPassword) {
        println("Неверный логин или пароль. Попробуйте ещё раз.")

        print("Введите логин: ")
        inputLogin = readln()

        print("Введите пароль: ")
        inputPassword = readln()
    }

    println("Авторизация прошла успешно")
}
