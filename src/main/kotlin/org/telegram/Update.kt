package org.telegram

data class Update(
        /**
        * The update�s unique identifier. Update identifiers start from a certain positive number and increase sequentially. This ID becomes especially handy if you�re using Webhooks, since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order. If there are no new updates for at least a week, then identifier of the next update will be chosen randomly instead of sequentially.
        */
        val updateId: Int,

        /**
        * Optional. New incoming message of any kind � text, photo, sticker, etc.
        */
        val message: Message? = null,

        /**
        * Optional. New version of a message that is known to the bot and was edited
        */
        val editedMessage: Message? = null,

        /**
        * Optional. New incoming channel post of any kind � text, photo, sticker, etc.
        */
        val channelPost: Message? = null,

        /**
        * Optional. New version of a channel post that is known to the bot and was edited
        */
        val editedChannelPost: Message? = null,

        /**
        * Optional. New incoming inline query
        */
        val inlineQuery: InlineQuery? = null,

        /**
        * Optional. The result of an inline query that was chosen by a user and sent to their chat partner. Please see our documentation on the feedback collecting for details on how to enable these updates for your bot.
        */
        val chosenInlineResult: ChosenInlineResult? = null,

        /**
        * Optional. New incoming callback query
        */
        val callbackQuery: CallbackQuery? = null,

        /**
        * Optional. New incoming shipping query. Only for invoices with flexible price
        */
        val shippingQuery: ShippingQuery? = null,

        /**
        * Optional. New incoming pre-checkout query. Contains full information about checkout
        */
        val preCheckoutQuery: PreCheckoutQuery? = null
)
