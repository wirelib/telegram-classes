package org.telegram

data class EditMessageText(
        /**
        * Required if inline_message_id is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String? = null,

        /**
        * Required if inline_message_id is not specified. Identifier of the sent message
        */
        val messageId: Int? = null,

        /**
        * Required if chat_id and message_id are not specified. Identifier of the inline message
        */
        val inlineMessageId: String? = null,

        /**
        * New text of the message
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
        * A JSON-serialized object for an inline keyboard.
        */
        val replyMarkup: ReplyMarkup? = null
)
