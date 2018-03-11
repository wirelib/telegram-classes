package org.telegram

data class InlineKeyboardButton(
        /**
        * Label text on the button
        */
        val text: String,

        /**
        * Optional. HTTP url to be opened when button is pressed
        */
        val url: String? = null,

        /**
        * Optional. Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes
        */
        val callbackData: String? = null,

        /**
        * Optional. If set, pressing the button will prompt the user to select one of their chats, open that chat and insert the bot�s username and the specified inline query in the input field. Can be empty, in which case just the bot�s username will be inserted. Note: This offers an easy way for users to start using your bot in inline mode when they are currently in a private chat with it. Especially useful when combined with switch_pm� actions � in this case the user will be automatically returned to the chat they switched from, skipping the chat selection screen.
        */
        val switchInlineQuery: String? = null,

        /**
        * Optional. If set, pressing the button will insert the bot�s username and the specified inline query in the current chat&#39;s input field. Can be empty, in which case only the bot�s username will be inserted. This offers a quick way for the user to open your bot in inline mode in the same chat � good for selecting something from multiple options.
        */
        val switchInlineQueryCurrentChat: String? = null,

        /**
        * Optional. Description of the game that will be launched when the user presses the button. NOTE: This type of button must always be the first button in the first row.
        */
        val callbackGame: CallbackGame? = null,

        /**
        * Optional. Specify True, to send a Pay button. NOTE: This type of button must always be the first button in the first row.
        */
        val pay: Boolean? = null
)
