package org.telegram

data class AnswerShippingQuery(
        /**
        * Unique identifier for the query to be answered
        */
        val shippingQueryId: String,

        /**
        * Specify True if delivery to the specified address is possible and False if there are any problems (for example, if delivery to the specified address is not possible)
        */
        val ok: Boolean,

        /**
        * Required if ok is True. A JSON-serialized array of available shipping options.
        */
        val shippingOptions: List<ShippingOption>? = null,

        /**
        * Required if ok is False. Error message in human readable form that explains why it is impossible to complete the order (e.g. &quot;Sorry, delivery to your desired address is unavailable&#39;). Telegram will display this message to the user.
        */
        val errorMessage: String? = null
)
