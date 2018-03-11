package org.telegram

data class MessageEntity(
        /**
        * Type of the entity. Can be mention (@username), hashtag, bot_command, url, email, bold (bold text), italic (italic text), code (monowidth string), pre (monowidth block), text_link (for clickable text URLs), text_mention (for users without usernames)
        */
        val type: String,

        /**
        * Offset in UTF-16 code units to the start of the entity
        */
        val offset: Int,

        /**
        * Length of the entity in UTF-16 code units
        */
        val length: Int,

        /**
        * Optional. For �text_link� only, url that will be opened after user taps on the text
        */
        val url: String? = null,

        /**
        * Optional. For �text_mention� only, the mentioned user
        */
        val user: User? = null
)
