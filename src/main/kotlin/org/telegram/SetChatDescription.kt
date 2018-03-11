package org.telegram

data class SetChatDescription(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * New chat description, 0-255 characters
        */
        val description: String? = null
)
