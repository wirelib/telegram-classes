package org.telegram

data class AnswerPreCheckoutQuery(
        /**
        * Unique identifier for the query to be answered
        */
        val preCheckoutQueryId: String,

        /**
        * Specify True if everything is alright (goods are available, etc.) and the bot is ready to proceed with the order. Use False if there are any problems.
        */
        val ok: Boolean,

        /**
        * Required if ok is False. Error message in human readable form that explains the reason for failure to proceed with the checkout (e.g. &quot;Sorry, somebody just bought the last of our amazing black T-shirts while you were busy filling out your payment details. Please choose a different color or garment!&quot;). Telegram will display this message to the user.
        */
        val errorMessage: String? = null
)
