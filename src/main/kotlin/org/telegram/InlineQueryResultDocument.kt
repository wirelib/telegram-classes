package org.telegram

data class InlineQueryResultDocument(
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
        * Optional. Caption of the document to be sent, 0-200 characters
        */
        val caption: String? = null,

        /**
        * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
        */
        val parseMode: String? = null,

        /**
        * A valid URL for the file
        */
        val documentUrl: String,

        /**
        * Mime type of the content of the file, either �application/pdf� or �application/zip�
        */
        val mimeType: String,

        /**
        * Optional. Short description of the result
        */
        val description: String? = null,

        /**
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null,

        /**
        * Optional. Content of the message to be sent instead of the file
        */
        val inputMessageContent: InputMessageContent? = null,

        /**
        * Optional. URL of the thumbnail (jpeg only) for the file
        */
        val thumbUrl: String? = null,

        /**
        * Optional. Thumbnail width
        */
        val thumbWidth: Int? = null,

        /**
        * Optional. Thumbnail height
        */
        val thumbHeight: Int? = null
): InlineQueryResult
