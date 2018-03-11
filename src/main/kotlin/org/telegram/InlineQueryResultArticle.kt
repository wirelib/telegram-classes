package org.telegram

data class InlineQueryResultArticle(
        /**
        * Type of the result, must be article
        */
        val type: String,

        /**
        * Unique identifier for this result, 1-64 Bytes
        */
        val id: String,

        /**
        * Title of the result
        */
        val title: String,

        /**
        * Content of the message to be sent
        */
        val inputMessageContent: InputMessageContent,

        /**
        * Optional. Inline keyboard attached to the message
        */
        val replyMarkup: ReplyMarkup? = null,

        /**
        * Optional. URL of the result
        */
        val url: String? = null,

        /**
        * Optional. Pass True, if you don&#39;t want the URL to be shown in the message
        */
        val hideUrl: Boolean? = null,

        /**
        * Optional. Short description of the result
        */
        val description: String? = null,

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
