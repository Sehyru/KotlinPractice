package org.example

fun main() {
    println("Добро пожаловать! Вы выбрали регистрацию.")
    println("Создайте логин: ")
    val registeredLogin = readln()

    println("Создайте пароль: ")
    val registeredPassword = readln()

    println("Регистрация завершена! Теперь войдите в приложение!")

    do {
        print("Введите логин: ")
        val inputLogin = readln()

        print("Введите пароль: ")
        val inputPassword = readln()

        if (inputLogin == registeredLogin && inputPassword == registeredPassword) {
            println("Авторизация прошла успешно")
            break
        }
    } while (true)
}
