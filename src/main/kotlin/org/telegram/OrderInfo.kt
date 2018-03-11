package org.telegram

data class OrderInfo(
        /**
        * Optional. User name
        */
        val name: String? = null,

        /**
        * Optional. User&#39;s phone number
        */
        val phoneNumber: String? = null,

        /**
        * Optional. User email
        */
        val email: String? = null,

        /**
        * Optional. User shipping address
        */
        val shippingAddress: ShippingAddress? = null
)
