package org.telegram

data class UnbanChatMember(
        /**
        * Unique identifier for the target group or username of the target supergroup or channel (in the format @username)
        */
        val chatId: String,

        /**
        * Unique identifier of the target user
        */
        val userId: Int
)
