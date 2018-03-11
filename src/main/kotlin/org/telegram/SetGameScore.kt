package org.telegram

data class SetGameScore(
        /**
        * User identifier
        */
        val userId: Int,

        /**
        * New score, must be non-negative
        */
        val score: Int,

        /**
        * Pass True, if the high score is allowed to decrease. This can be useful when fixing mistakes or banning cheaters
        */
        val force: Boolean? = null,

        /**
        * Pass True, if the game message should not be automatically edited to include the current scoreboard
        */
        val disableEditMessage: Boolean? = null,

        /**
        * Required if inline_message_id is not specified. Unique identifier for the target chat
        */
        val chatId: Int? = null,

        /**
        * Required if inline_message_id is not specified. Identifier of the sent message
        */
        val messageId: Int? = null,

        /**
        * Required if chat_id and message_id are not specified. Identifier of the inline message
        */
        val inlineMessageId: String? = null
)
