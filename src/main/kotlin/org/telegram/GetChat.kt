package org.telegram

data class GetChat(
        /**
        * Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
        */
        val chatId: String
)
