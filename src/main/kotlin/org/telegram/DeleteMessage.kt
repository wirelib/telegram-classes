package org.telegram

data class DeleteMessage(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Identifier of the message to delete
        */
        val messageId: Int
)
