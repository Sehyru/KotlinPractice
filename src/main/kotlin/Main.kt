package org.example

class Contact(val name: String, val phone: Long, val company: String? = null)

fun main() {
    val contacts = listOf(
        Contact("Ростислав", 89123456789, "Reddit"),
        Contact("Анна", 89234567891, null),
        Contact("Игорь", 89345678912, "null"),
        Contact("Мария", 89456789123, null),
        Contact("Дмитрий", 89567891234, "Google")
    )

    val companies = mutableListOf<String>()
    for (contact in contacts) {
        val company = contact.company ?: "<не указано>"
        if (!companies.contains(company)) {
            companies.add(company)
        }
    }

    println(companies)
}