package org.telegram

data class InlineQueryResultCachedDocument(
        /**
        * Type of the result, must be document
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 bytes
        */
        val id: String,

        /**
        * Title for the result
        */
        val title: String,

        /**
        * A valid file identifier for the file
        */
        val documentFileId: String,

        /**
        * Optional. Short description of the result
        */
        val description: String? = null,

        /**
        * Optional. Caption of the document to be sent, 0-200 characters
        */
        val caption: String? = null,

        /**
        * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
        */
        val parseMode: String? = null,

        /**
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null,

        /**
        * Optional. Content of the message to be sent instead of the file
        */
        val inputMessageContent: InputMessageContent? = null
): InlineQueryResult
