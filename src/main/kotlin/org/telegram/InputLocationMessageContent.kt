package org.telegram

data class InputLocationMessageContent(
        /**
        * Latitude of the location in degrees
        */
        val latitude: Float,

        /**
        * Longitude of the location in degrees
        */
        val longitude: Float,

        /**
        * Optional. Period in seconds for which the location can be updated, should be between 60 and 86400.
        */
        val livePeriod: Int? = null
): InputMessageContent
