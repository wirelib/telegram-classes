package org.telegram

data class InlineQueryResultGame(
        /**
        * Type of the result, must be game
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 bytes
        */
        val id: String,

        /**
        * Short name of the game
        */
        val gameShortName: String,

        /**
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null
): InlineQueryResult
