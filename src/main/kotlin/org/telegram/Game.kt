package org.telegram

data class Game(
        /**
        * Title of the game
        */
        val title: String,

        /**
        * Description of the game
        */
        val description: String,

        /**
        * Photo that will be displayed in the game message in chats.
        */
        val photo: List<PhotoSize>,

        /**
        * Optional. Brief description of the game or high scores included in the game message. Can be automatically edited to include current high scores for the game when the bot calls setGameScore, or manually edited using editMessageText. 0-4096 characters.
        */
        val text: String? = null,

        /**
        * Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
        */
        val textEntities: List<MessageEntity>? = null,

        /**
        * Optional. Animation that will be displayed in the game message in chats. Upload via BotFather
        */
        val animation: Animation? = null
)
