package org.example

class Contact(val name: String, val phone: Long, val company: String? = null) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phone\nКомпания: ${company ?: "не указано"}")
    }
}

fun main() {
    val contacts = mutableListOf<Contact>()

    while (true) {
        println("Введите имя:")
        val name = readln()

        if (name.isBlank()) {
            break
        }

        println("Введите номер телефона:")
        val phoneInput = readln().toLongOrNull()

        if (phoneInput == null) {
            println("Номер телефона не введён, контакт не будет добавлен")
            continue
        }

        println("Введите компанию (можно оставить пустым):")
        val companyInput = readln()
        val company = if (companyInput.isBlank()) null else companyInput

        contacts.add(Contact(name, phoneInput, company))
    }

    for (contact in contacts) {
        contact.printInfo()
    }
}