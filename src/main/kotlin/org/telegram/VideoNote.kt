package org.telegram

data class VideoNote(
        /**
        * Unique identifier for this file
        */
        val fileId: String,

        /**
        * Video width and height as defined by sender
        */
        val length: Int,

        /**
        * Duration of the video in seconds as defined by sender
        */
        val duration: Int,

        /**
        * Optional. Video thumbnail
        */
        val thumb: PhotoSize? = null,

        /**
        * Optional. File size
        */
        val fileSize: Int? = null
)
