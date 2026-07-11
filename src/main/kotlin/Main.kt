package org.example

class MemberForum(val userId: Int, val userName: String)
class MessageForum(val authorId: Int, val message: String)

class Forum {
    var memberList: MutableList<MemberForum> = mutableListOf()
    var messageList: MutableList<MessageForum> = mutableListOf()
    var nextUserId = 1

    fun createNewUser(userName: String): MemberForum {
        val newMember = MemberForum(nextUserId, userName)
        memberList.add(newMember)
        nextUserId++
        return newMember
    }

    fun createNewMessage(userId: Int, message: String) {
        val member = memberList.find { it.userId == userId }
        if (member != null) {
            messageList.add(MessageForum(userId, message))
        } else {
            println("Пользователь $userId не найден!")
        }
    }

    fun printThread() {
        for (msg in messageList) {
            val author = memberList.find { it.userId == msg.authorId }
            val authorName = author?.userName
            println("$authorName: ${msg.message}")
        }
    }
}


fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("John")
    val user2 = forum.createNewUser(("Mike"))

    forum.createNewMessage(user1.userId, "Hello everyone!")
    forum.createNewMessage(user1.userId, "How are you?")
    forum.createNewMessage(user2.userId, "Hello, John!")
    forum.createNewMessage(user2.userId, "I'm fine")

    forum.printThread()
}