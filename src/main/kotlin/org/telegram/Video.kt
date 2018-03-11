package org.telegram

data class Video(
        /**
        * Unique identifier for this file
        */
        val fileId: String,

        /**
        * Video width as defined by sender
        */
        val width: Int,

        /**
        * Video height as defined by sender
        */
        val height: Int,

        /**
        * Duration of the video in seconds as defined by sender
        */
        val duration: Int,

        /**
        * Optional. Video thumbnail
        */
        val thumb: PhotoSize? = null,

        /**
        * Optional. Mime type of a file as defined by sender
        */
        val mimeType: String? = null,

        /**
        * Optional. File size
        */
        val fileSize: Int? = null
)
