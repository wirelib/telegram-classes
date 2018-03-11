package org.telegram

data class InlineQueryResultCachedVideo(
        /**
        * Type of the result, must be video
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 bytes
        */
        val id: String,

        /**
        * A valid file identifier for the video file
        */
        val videoFileId: String,

        /**
        * Title for the result
        */
        val title: String,

        /**
        * Optional. Short description of the result
        */
        val description: String? = null,

        /**
        * Optional. Caption of the video to be sent, 0-200 characters
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
        * Optional. Content of the message to be sent instead of the video
        */
        val inputMessageContent: InputMessageContent? = null
): InlineQueryResult
