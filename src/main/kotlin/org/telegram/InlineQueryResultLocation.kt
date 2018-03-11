package org.telegram

data class InlineQueryResultLocation(
        /**
        * Type of the result, must be location
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 Bytes
        */
        val id: String,

        /**
        * Location latitude in degrees
        */
        val latitude: Float,

        /**
        * Location longitude in degrees
        */
        val longitude: Float,

        /**
        * Location title
        */
        val title: String,

        /**
        * Optional. Period in seconds for which the location can be updated, should be between 60 and 86400.
        */
        val livePeriod: Int? = null,

        /**
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null,

        /**
        * Optional. Content of the message to be sent instead of the location
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
