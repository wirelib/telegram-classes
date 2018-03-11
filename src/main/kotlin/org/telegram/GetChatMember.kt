package org.telegram

data class GetChatMember(
        /**
        * Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Unique identifier of the target user
        */
        val userId: Int
)
