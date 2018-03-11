package org.telegram

data class InlineQueryResultCachedMpeg4Gif(
        /**
        * Type of the result, must be mpeg4_gif
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 bytes
        */
        val id: String,

        /**
        * A valid file identifier for the MP4 file
        */
        val mpeg4FileId: String,

        /**
        * Optional. Title for the result
        */
        val title: String? = null,

        /**
        * Optional. Caption of the MPEG-4 file to be sent, 0-200 characters
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
        * Optional. Content of the message to be sent instead of the video animation
        */
        val inputMessageContent: InputMessageContent? = null
): InlineQueryResult
