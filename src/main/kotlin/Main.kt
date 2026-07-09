package org.example

class Member(
    val name: String,
    var status: String
)

class Room {
    var cover: String = ""
    var roomName: String = ""
    var membersList: MutableList<Member> = mutableListOf()

    fun addMember(member: Member) {
        membersList.add(member)
        println("Участник: ${member.name} добавлен. Статус: ${member.status}. Всего участников: ${membersList.size}")
    }

    fun statusUpdate(memberName: String, newStatus: String) {
        val member = membersList.find { it.name == memberName }
        if (member != null) {
            member.status = newStatus
            println("Участник: $memberName. Статус обновлён: $newStatus")
        } else {
            println("Участник $memberName не найден.")
        }
    }
}

fun main() {
    val room = Room()
    room.cover = "cover.png"
    room.roomName = "Четыре комнаты"

    room.addMember(Member("Костя", "разговаривает"))
    room.addMember(Member("Саша", "микрофон выключен"))

    room.statusUpdate("Костя", "пользователь заглушен")
}