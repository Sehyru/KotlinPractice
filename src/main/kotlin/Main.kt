package org.example

class User2 {
    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var email: String = ""
    var bio: String = ""
    fun info() {
        println("#$id, $login, $password, $email, $bio")
    }

    fun updateBio() {
        println("Заполни bio: ")
        bio = readln()
    }

    fun changePassword() {
        println("Изменение пароля. Введите текущий пароль: ")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен.")
        } else {
            println("Неверный текущий пароль.")
        }
    }
}

fun main() {
    val user = User2()
    user.id = 1
    user.login = "user1"
    user.password = "pass1"
    user.email = "user1@gmail.com"

    user.info()
    user.updateBio()
    user.changePassword()
    user.info()
}