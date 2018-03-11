package org.telegram

data class InlineQueryResultCachedSticker(
        /**
        * Type of the result, must be sticker
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 bytes
        */
        val id: String,

        /**
        * A valid file identifier of the sticker
        */
        val stickerFileId: String,

        /**
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null,

        /**
        * Optional. Content of the message to be sent instead of the sticker
        */
        val inputMessageContent: InputMessageContent? = null
): InlineQueryResult
