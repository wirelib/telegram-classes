package org.telegram

data class AddStickerToSet(
        /**
        * User identifier of sticker set owner
        */
        val userId: Int,

        /**
        * Sticker set name
        */
        val name: String,

        /**
        * Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using multipart/form-data. More info on Sending Files �
        */
        val pngSticker: String,

        /**
        * One or more emoji corresponding to the sticker
        */
        val emojis: String,

        /**
        * A JSON-serialized object for position where the mask should be placed on faces
        */
        val maskPosition: MaskPosition? = null
)
