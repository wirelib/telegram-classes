package org.telegram

data class InputVenueMessageContent(
        /**
        * Latitude of the venue in degrees
        */
        val latitude: Float,

        /**
        * Longitude of the venue in degrees
        */
        val longitude: Float,

        /**
        * Name of the venue
        */
        val title: String,

        /**
        * Address of the venue
        */
        val address: String,

        /**
        * Optional. Foursquare identifier of the venue, if known
        */
        val foursquareId: String? = null
): InputMessageContent
