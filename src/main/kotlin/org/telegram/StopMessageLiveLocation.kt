package org.telegram

data class StopMessageLiveLocation(
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
        * A JSON-serialized object for a new inline keyboard.
        */
        val replyMarkup: ReplyMarkup? = null
)
