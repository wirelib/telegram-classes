package org.telegram

data class InlineQueryResultVenue(
        /**
        * Type of the result, must be venue
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 Bytes
        */
        val id: String,

        /**
        * Latitude of the venue location in degrees
        */
        val latitude: Float,

        /**
        * Longitude of the venue location in degrees
        */
        val longitude: Float,

        /**
        * Title of the venue
        */
        val title: String,

        /**
        * Address of the venue
        */
        val address: String,

        /**
        * Optional. Foursquare identifier of the venue if known
        */
        val foursquareId: String? = null,

        /**
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null,

        /**
        * Optional. Content of the message to be sent instead of the venue
        */
        val inputMessageContent: InputMessageContent? = null,

        /**
        * Optional. Url of the thumbnail for the result
        */
        val thumbUrl: String? = null,

        /**
        * Optional. Thumbnail width
        */
        val thumbWidth: Int? = null,

        /**
        * Optional. Thumbnail height
        */
        val thumbHeight: Int? = null
): InlineQueryResult
