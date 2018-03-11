package org.telegram

data class AnswerCallbackQuery(
        /**
        * Unique identifier for the query to be answered
        */
        val callbackQueryId: String,

        /**
        * Unique identifier for the query to be answered
        */
        val text: String? = null,

        /**
        * Unique identifier for the query to be answered
        */
        val showAlert: Boolean? = null,

        /**
        * Unique identifier for the query to be answered
        */
        val url: String? = null,

        /**
        * Unique identifier for the query to be answered
        */
        val cacheTime: Int? = null
)
