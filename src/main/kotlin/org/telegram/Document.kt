package org.telegram

data class Document(
        /**
        * Unique file identifier
        */
        val fileId: String,

        /**
        * Optional. Document thumbnail as defined by sender
        */
        val thumb: PhotoSize? = null,

        /**
        * Optional. Original filename as defined by sender
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
