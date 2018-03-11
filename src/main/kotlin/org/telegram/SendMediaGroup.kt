package org.telegram

data class SendMediaGroup(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * A JSON-serialized array describing photos and videos to be sent, must include 2�10 items
        */
        val media: List<InputMedia>,

        /**
        * Sends the messages silently. Users will receive a notification with no sound.
        */
        val disableNotification: Boolean? = null,

        /**
        * If the messages are a reply, ID of the original message
        */
        val replyToMessageId: Int? = null
)
