package org.telegram

data class StickerSet(
        /**
        * Sticker set name
        */
        val name: String,

        /**
        * Sticker set title
        */
        val title: String,

        /**
        * True, if the sticker set contains masks
        */
        val containsMasks: Boolean,

        /**
        * List of all set stickers
        */
        val stickers: List<Sticker>
)
