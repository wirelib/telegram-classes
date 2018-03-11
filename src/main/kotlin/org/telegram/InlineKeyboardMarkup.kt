package org.telegram

data class InlineKeyboardMarkup(
        /**
        * Array of button rows, each represented by an Array of InlineKeyboardButton objects
        */
        val inlineKeyboard: List<List<InlineKeyboardButton>>
): ReplyMarkup
