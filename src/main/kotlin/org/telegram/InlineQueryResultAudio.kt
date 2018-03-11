package org.telegram

data class InlineQueryResultAudio(
        /**
        * Type of the result, must be audio
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 bytes
        */
        val id: String,

        /**
        * A valid URL for the audio file
        */
        val audioUrl: String,

        /**
        * Title
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
        * Optional. Performer
        */
        val performer: String? = null,

        /**
        * Optional. Audio duration in seconds
        */
        val audioDuration: Int? = null,

        /**
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null,

        /**
        * Optional. Content of the message to be sent instead of the audio
        */
        val inputMessageContent: InputMessageContent? = null
): InlineQueryResult
