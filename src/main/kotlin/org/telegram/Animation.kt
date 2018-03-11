package org.telegram

data class Animation(
        /**
        * Unique file identifier
        */
        val fileId: String,

        /**
        * Optional. Animation thumbnail as defined by sender
        */
        val thumb: PhotoSize? = null,

        /**
        * Optional. Original animation filename as defined by sender
        */
        val fileName: String? = null,

        /**
        * Optional. MIME type of the file as defined by sender
        */
        val mimeType: String? = null,

        /**
        * Optional. File size
        */
        val fileSize: Int? = null
)
