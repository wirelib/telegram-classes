package org.telegram

data class Voice(
        /**
        * Unique identifier for this file
        */
        val fileId: String,

        /**
        * Duration of the audio in seconds as defined by sender
        */
        val duration: Int,

        /**
        * Optional. MIME type of the file as defined by sender
        */
        val mimeType: String? = null,

        /**
        * Optional. File size
        */
        val fileSize: Int? = null
)
