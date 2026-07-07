package org.example

const val CREDENTIALS_LOGIN = "Sergey"
const val CREDENTIALS_PASSWORD = "Bubbles"

fun validateLogin(login: String, password: String): Boolean = login == CREDENTIALS_LOGIN && password == CREDENTIALS_PASSWORD

fun generateToken(length: Int = 32): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return (1..length).map { chars.random() }.joinToString("")
}

fun authorize(login: String, password: String): String? = if (validateLogin(login, password)) generateToken() else null

fun getCart(token: String?): List<String>? {
    val cartList = listOf("Компьютер", "Фотоаппарат", "Планшет")
    return if (token != null) cartList else null
}

fun main() {
    val token = authorize(CREDENTIALS_LOGIN, CREDENTIALS_PASSWORD)
    val cart = getCart(token)

    if (cart != null) {
        println("Содержимое корзины: $cart")
    } else {
        println("Авторизация прошла неудачно!")
    }
}