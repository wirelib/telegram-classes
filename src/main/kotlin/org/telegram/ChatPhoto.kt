package org.telegram

data class ChatPhoto(
        /**
        * Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo download.
        */
        val smallFileId: String,

        /**
        * Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download.
        */
        val bigFileId: String
)
