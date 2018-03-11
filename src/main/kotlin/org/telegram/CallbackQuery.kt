package org.telegram

data class CallbackQuery(
        /**
        * Unique identifier for this query
        */
        val id: String,

        /**
        * Sender
        */
        val from: User,

        /**
        * Optional. Message with the callback button that originated the query. Note that message content and message date will not be available if the message is too old
        */
        val message: Message? = null,

        /**
        * Optional. Identifier of the message sent via the bot in inline mode, that originated the query.
        */
        val inlineMessageId: String? = null,

        /**
        * Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent. Useful for high scores in games.
        */
        val chatInstance: String,

        /**
        * Optional. Data associated with the callback button. Be aware that a bad client can send arbitrary data in this field.
        */
        val data: String? = null,

        /**
        * Optional. Short name of a Game to be returned, serves as the unique identifier for the game
        */
        val gameShortName: String? = null
)
