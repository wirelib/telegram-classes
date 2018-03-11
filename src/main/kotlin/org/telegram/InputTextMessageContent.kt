package org.telegram

data class InputTextMessageContent(
        /**
        * Text of the message to be sent, 1-4096 characters
        */
        val messageText: String,

        /**
        * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot&#39;s message.
        */
        val parseMode: String? = null,

        /**
        * Optional. Disables link previews for links in the sent message
        */
        val disableWebPagePreview: Boolean? = null
): InputMessageContent
