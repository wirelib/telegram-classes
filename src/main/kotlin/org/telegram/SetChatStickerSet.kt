package org.telegram

data class SetChatStickerSet(
        /**
        * Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
        */
        val chatId: String,

        /**
        * Name of the sticker set to be set as the group sticker set
        */
        val stickerSetName: String
)
