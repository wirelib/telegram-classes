package org.telegram

data class SendVenue(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Latitude of the venue
        */
        val latitude: Float,

        /**
        * Longitude of the venue
        */
        val longitude: Float,

        /**
        * Name of the venue
        */
        val title: String,

        /**
        * Address of the venue
        */
        val address: String,

        /**
        * Foursquare identifier of the venue
        */
        val foursquareId: String? = null,

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
