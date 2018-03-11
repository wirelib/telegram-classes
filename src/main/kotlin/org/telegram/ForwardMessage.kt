package org.telegram

data class ForwardMessage(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
        */
        val fromChatId: String,

        /**
        * Sends the message silently. Users will receive a notification with no sound.
        */
        val disableNotification: Boolean? = null,

        /**
        * Message identifier in the chat specified in from_chat_id
        */
        val messageId: Int
)
