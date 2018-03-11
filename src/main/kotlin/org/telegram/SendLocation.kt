package org.telegram

data class SendLocation(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Latitude of the location
        */
        val latitude: Float,

        /**
        * Longitude of the location
        */
        val longitude: Float,

        /**
        * Period in seconds for which the location will be updated (see Live Locations, should be between 60 and 86400.
        */
        val livePeriod: Int? = null,

        /**
        * Sends the message silently. Users will receive a notification with no sound.
        */
        val disableNotification: Boolean? = null,

        /**
        * If the message is a reply, ID of the original message
        */
        val replyToMessageId: Int? = null,

        /**
        * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
        */
        val replyMarkup: ReplyMarkup? = null
)
