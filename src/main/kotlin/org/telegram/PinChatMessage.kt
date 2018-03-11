package org.telegram

data class PinChatMessage(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Identifier of a message to pin
        */
        val messageId: Int,

        /**
        * Pass True, if it is not necessary to send a notification to all chat members about the new pinned message. Notifications are always disabled in channels.
        */
        val disableNotification: Boolean? = null
)
