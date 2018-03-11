package org.telegram

data class EditMessageCaption(
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
        * New caption of the message
        */
        val caption: String? = null,

        /**
        * Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
        */
        val parseMode: String? = null,

        /**
        * A JSON-serialized object for an inline keyboard.
        */
        val replyMarkup: ReplyMarkup? = null
)
