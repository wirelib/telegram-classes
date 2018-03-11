package org.telegram

data class ShippingQuery(
        /**
        * Unique query identifier
        */
        val id: String,

        /**
        * User who sent the query
        */
        val from: User,

        /**
        * Bot specified invoice payload
        */
        val invoicePayload: String,

        /**
        * User specified shipping address
        */
        val shippingAddress: ShippingAddress
)
