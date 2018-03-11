package org.telegram

data class SendInvoice(
        /**
        * Unique identifier for the target private chat
        */
        val chatId: Int,

        /**
        * Product name, 1-32 characters
        */
        val title: String,

        /**
        * Product description, 1-255 characters
        */
        val description: String,

        /**
        * Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use for your internal processes.
        */
        val payload: String,

        /**
        * Payments provider token, obtained via Botfather
        */
        val providerToken: String,

        /**
        * Unique deep-linking parameter that can be used to generate this invoice when used as a start parameter
        */
        val startParameter: String,

        /**
        * Three-letter ISO 4217 currency code, see more on currencies
        */
        val currency: String,

        /**
        * Price breakdown, a list of components (e.g. product price, tax, discount, delivery cost, delivery tax, bonus, etc.)
        */
        val prices: List<LabeledPrice>,

        /**
        * JSON-encoded data about the invoice, which will be shared with the payment provider. A detailed description of required fields should be provided by the payment provider.
        */
        val providerData: String? = null,

        /**
        * URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service. People like it better when they see what they are paying for.
        */
        val photoUrl: String? = null,

        /**
        * Photo size
        */
        val photoSize: Int? = null,

        /**
        * Photo width
        */
        val photoWidth: Int? = null,

        /**
        * Photo height
        */
        val photoHeight: Int? = null,

        /**
        * Pass True, if you require the user&#39;s full name to complete the order
        */
        val needName: Boolean? = null,

        /**
        * Pass True, if you require the user&#39;s phone number to complete the order
        */
        val needPhoneNumber: Boolean? = null,

        /**
        * Pass True, if you require the user&#39;s email address to complete the order
        */
        val needEmail: Boolean? = null,

        /**
        * Pass True, if you require the user&#39;s shipping address to complete the order
        */
        val needShippingAddress: Boolean? = null,

        /**
        * Pass True, if user&#39;s phone number should be sent to provider
        */
        val sendPhoneNumberToProvider: Boolean? = null,

        /**
        * Pass True, if user&#39;s email address should be sent to provider
        */
        val sendEmailToProvider: Boolean? = null,

        /**
        * Pass True, if the final price depends on the shipping method
        */
        val isFlexible: Boolean? = null,

        /**
        * Sends the message silently. Users will receive a notification with no sound.
        */
        val disableNotification: Boolean? = null,

        /**
        * If the message is a reply, ID of the original message
        */
        val replyToMessageId: Int? = null,

        /**
        * A JSON-serialized object for an inline keyboard. If empty, one &#39;Pay total price&#39; button will be shown. If not empty, the first button must be a Pay button.
        */
        val replyMarkup: ReplyMarkup? = null
)
