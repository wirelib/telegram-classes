package org.telegram

data class ChosenInlineResult(
        /**
        * The unique identifier for the result that was chosen
        */
        val resultId: String,

        /**
        * The user that chose the result
        */
        val from: User,

        /**
        * Optional. Sender location, only for bots that require user location
        */
        val location: Location? = null,

        /**
        * Optional. Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message. Will be also received in callback queries and can be used to edit the message.
        */
        val inlineMessageId: String? = null,

        /**
        * The query that was used to obtain the result
        */
        val query: String
)
