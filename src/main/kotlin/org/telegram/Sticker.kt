package org.telegram

data class Sticker(
        /**
        * Unique identifier for this file
        */
        val fileId: String,

        /**
        * Sticker width
        */
        val width: Int,

        /**
        * Sticker height
        */
        val height: Int,

        /**
        * Optional. Sticker thumbnail in the .webp or .jpg format
        */
        val thumb: PhotoSize? = null,

        /**
        * Optional. Emoji associated with the sticker
        */
        val emoji: String? = null,

        /**
        * Optional. Name of the sticker set to which the sticker belongs
        */
        val setName: String? = null,

        /**
        * Optional. For mask stickers, the position where the mask should be placed
        */
        val maskPosition: MaskPosition? = null,

        /**
        * Optional. File size
        */
        val fileSize: Int? = null
)
