package org.example

class User {
    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var email: String = ""
}

fun main() {
    val user1 = User()
    val user2 = User()

    user1.id = 1
    user1.login = "user1"
    user1.password = "pass1"
    user1.email = "user1@gmail.com"

    user2.id = 2
    user2.login = "user2"
    user2.password = "pass2"
    user2.email = "user2@gmail.com"

    println("#${user1.id}, ${user1.login}, ${user1.password}, ${user1.email}")
    println("#${user2.id}, ${user2.login}, ${user2.password}, ${user2.email}")
}