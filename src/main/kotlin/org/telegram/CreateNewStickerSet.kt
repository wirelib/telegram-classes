package org.telegram

data class CreateNewStickerSet(
        /**
        * User identifier of created sticker set owner
        */
        val userId: Int,

        /**
        * Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only english letters, digits and underscores. Must begin with a letter, can&#39;t contain consecutive underscores and must end in �_by_&lt;bot username&gt;�. &lt;bot_username&gt; is case insensitive. 1-64 characters.
        */
        val name: String,

        /**
        * Sticker set title, 1-64 characters
        */
        val title: String,

        /**
        * Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using multipart/form-data. More info on Sending Files �
        */
        val pngSticker: String,

        /**
        * One or more emoji corresponding to the sticker
        */
        val emojis: String,

        /**
        * Pass True, if a set of mask stickers should be created
        */
        val containsMasks: Boolean? = null,

        /**
        * A JSON-serialized object for position where the mask should be placed on faces
        */
        val maskPosition: MaskPosition? = null
)
