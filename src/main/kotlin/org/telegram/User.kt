package org.telegram

data class User(
        /**
        * Unique identifier for this user or bot
        */
        val id: Int,

        /**
        * True, if this user is a bot
        */
        val isBot: Boolean,

        /**
        * User�s or bot�s first name
        */
        val firstName: String,

        /**
        * Optional. User�s or bot�s last name
        */
        val lastName: String? = null,

        /**
        * Optional. User�s or bot�s username
        */
        val username: String? = null,

        /**
        * Optional. IETF language tag of the user&#39;s language
        */
        val languageCode: String? = null
)
