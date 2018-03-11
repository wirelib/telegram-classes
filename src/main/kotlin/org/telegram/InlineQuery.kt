package org.telegram

data class InlineQuery(
        /**
        * Unique identifier for this query
        */
        val id: String,

        /**
        * Sender
        */
        val from: User,

        /**
        * Optional. Sender location, only for bots that request user location
        */
        val location: Location? = null,

        /**
        * Text of the query (up to 512 characters)
        */
        val query: String,

        /**
        * Offset of the results to be returned, can be controlled by the bot
        */
        val offset: String
)
