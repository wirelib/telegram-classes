package org.telegram

data class SendMessage(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Text of the message to be sent
        */
        val text: String,

        /**
        * Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot&#39;s message.
        */
        val parseMode: String? = null,

        /**
        * Disables link previews for links in this message
        */
        val disableWebPagePreview: Boolean? = null,

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
