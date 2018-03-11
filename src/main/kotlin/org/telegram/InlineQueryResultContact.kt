package org.telegram

data class InlineQueryResultContact(
        /**
        * Type of the result, must be contact
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 Bytes
        */
        val id: String,

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
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null,

        /**
        * Optional. Content of the message to be sent instead of the contact
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
