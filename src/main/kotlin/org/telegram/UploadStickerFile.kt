package org.telegram

data class UploadStickerFile(
        /**
        * User identifier of sticker file owner
        */
        val userId: Int,

        /**
        * Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. More info on Sending Files �
        */
        val pngSticker: java.io.File
)
