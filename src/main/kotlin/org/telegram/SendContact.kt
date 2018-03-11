package org.telegram

data class SendContact(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Contact&#39;s phone number
        */
        val phoneNumber: String,

        /**
        * Contact&#39;s first name
        */
        val firstName: String,

        /**
        * Contact&#39;s last name
        */
        val lastName: String? = null,

        /**
        * Sends the message silently. Users will receive a notification with no sound.
        */
        val disableNotification: Boolean? = null,

        /**
        * If the message is a reply, ID of the original message
        */
        val replyToMessageId: Int? = null,

        /**
        * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove keyboard or to force a reply from the user.
        */
        val replyMarkup: ReplyMarkup? = null
)
