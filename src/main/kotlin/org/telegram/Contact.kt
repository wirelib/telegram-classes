package org.telegram

data class Contact(
        /**
        * Contact&#39;s phone number
        */
        val phoneNumber: String,

        /**
        * Contact&#39;s first name
        */
        val firstName: String,

        /**
        * Optional. Contact&#39;s last name
        */
        val lastName: String? = null,

        /**
        * Optional. Contact&#39;s user identifier in Telegram
        */
        val userId: Int? = null
)
