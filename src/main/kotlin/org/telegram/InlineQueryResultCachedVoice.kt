package org.telegram

data class InlineQueryResultCachedVoice(
        /**
        * Type of the result, must be voice
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 bytes
        */
        val id: String,

        /**
        * A valid file identifier for the voice message
        */
        val voiceFileId: String,

        /**
        * Voice message title
        */
        val title: String,

        /**
        * Optional. Caption, 0-200 characters
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
        * Optional. Content of the message to be sent instead of the voice message
        */
        val inputMessageContent: InputMessageContent? = null
): InlineQueryResult
