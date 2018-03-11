package org.telegram

data class UserProfilePhotos(
        /**
        * Total number of profile pictures the target user has
        */
        val totalCount: Int,

        /**
        * Requested profile pictures (in up to 4 sizes each)
        */
        val photos: List<List<PhotoSize>>
)
