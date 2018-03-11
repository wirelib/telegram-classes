package org.telegram

data class KeyboardButton(
        /**
        * Text of the button. If none of the optional fields are used, it will be sent as a message when the button is pressed
        */
        val text: String,

        /**
        * Optional. If True, the user&#39;s phone number will be sent as a contact when the button is pressed. Available in private chats only
        */
        val requestContact: Boolean? = null,

        /**
        * Optional. If True, the user&#39;s current location will be sent when the button is pressed. Available in private chats only
        */
        val requestLocation: Boolean? = null
)
