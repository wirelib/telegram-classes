package org.telegram

data class PhotoSize(
        /**
        * Unique identifier for this file
        */
        val fileId: String,

        /**
        * Photo width
        */
        val width: Int,

        /**
        * Photo height
        */
        val height: Int,

        /**
        * Optional. File size
        */
        val fileSize: Int? = null
)
