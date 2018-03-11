package org.telegram

data class SendVideoNote(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Video note to send. Pass a file_id as String to send a video note that exists on the Telegram servers (recommended) or upload a new video using multipart/form-data. More info on Sending Files �. Sending video notes by a URL is currently unsupported
        */
        val videoNote: String,

        /**
        * Duration of sent video in seconds
        */
        val duration: Int? = null,

        /**
        * Video width and height
        */
        val length: Int? = null,

        /**
        * Sends the message silently. Users will receive a notification with no sound.
        */
        val disableNotification: Boolean? = null,

        /**
        * If the message is a reply, ID of the original message
        */
        val replyToMessageId: Int? = null,

        /**
        * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
        */
        val replyMarkup: ReplyMarkup? = null
)
