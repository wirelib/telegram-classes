package org.telegram

data class SetStickerPositionInSet(
        /**
        * File identifier of the sticker
        */
        val sticker: String,

        /**
        * New sticker position in the set, zero-based
        */
        val position: Int
)
