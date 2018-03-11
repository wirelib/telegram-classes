package org.telegram

data class Venue(
        /**
        * Venue location
        */
        val location: Location,

        /**
        * Name of the venue
        */
        val title: String,

        /**
        * Address of the venue
        */
        val address: String,

        /**
        * Optional. Foursquare identifier of the venue
        */
        val foursquareId: String? = null
)
