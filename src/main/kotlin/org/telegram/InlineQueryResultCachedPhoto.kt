package org.telegram

data class InlineQueryResultCachedPhoto(
        /**
        * Type of the result, must be photo
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 bytes
        */
        val id: String,

        /**
        * A valid file identifier of the photo
        */
        val photoFileId: String,

        /**
        * Optional. Title for the result
        */
        val title: String? = null,

        /**
        * Optional. Short description of the result
        */
        val description: String? = null,

        /**
        * Optional. Caption of the photo to be sent, 0-200 characters
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
        * Optional. Content of the message to be sent instead of the photo
        */
        val inputMessageContent: InputMessageContent? = null
): InlineQueryResult
