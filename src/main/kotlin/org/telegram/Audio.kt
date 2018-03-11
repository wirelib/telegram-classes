package org.telegram

data class Audio(
        /**
        * Unique identifier for this file
        */
        val fileId: String,

        /**
        * Duration of the audio in seconds as defined by sender
        */
        val duration: Int,

        /**
        * Optional. Performer of the audio as defined by sender or by audio tags
        */
        val performer: String? = null,

        /**
        * Optional. Title of the audio as defined by sender or by audio tags
        */
        val title: String? = null,

        /**
        * Optional. MIME type of the file as defined by sender
        */
        val mimeType: String? = null,

        /**
        * Optional. File size
        */
        val fileSize: Int? = null
)
