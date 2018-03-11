package org.telegram

data class GetUserProfilePhotos(
        /**
        * Unique identifier of the target user
        */
        val userId: Int,

        /**
        * Sequential number of the first photo to be returned. By default, all photos are returned.
        */
        val offset: Int? = null,

        /**
        * Limits the number of photos to be retrieved. Values between 1�100 are accepted. Defaults to 100.
        */
        val limit: Int? = null
)
