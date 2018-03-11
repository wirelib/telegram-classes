package org.telegram

data class SendGame(
        /**
        * Unique identifier for the target chat
        */
        val chatId: Int,

        /**
        * Short name of the game, serves as the unique identifier for the game. Set up your games via Botfather.
        */
        val gameShortName: String,

        /**
        * Sends the message silently. Users will receive a notification with no sound.
        */
        val disableNotification: Boolean? = null,

        /**
        * If the message is a reply, ID of the original message
        */
        val replyToMessageId: Int? = null,

        /**
        * A JSON-serialized object for an inline keyboard. If empty, one �Play game_title� button will be shown. If not empty, the first button must launch the game.
        */
        val replyMarkup: ReplyMarkup? = null
)
