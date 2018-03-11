package org.telegram

data class ShippingOption(
        /**
        * Shipping option identifier
        */
        val id: String,

        /**
        * Option title
        */
        val title: String,

        /**
        * List of price portions
        */
        val prices: List<LabeledPrice>
)
