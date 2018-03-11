package org.telegram

data class RestrictChatMember(
        /**
        * Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
        */
        val chatId: String,

        /**
        * Unique identifier of the target user
        */
        val userId: Int,

        /**
        * Date when restrictions will be lifted for the user, unix time. If user is restricted for more than 366 days or less than 30 seconds from the current time, they are considered to be restricted forever
        */
        val untilDate: Int? = null,

        /**
        * Pass True, if the user can send text messages, contacts, locations and venues
        */
        val canSendMessages: Boolean? = null,

        /**
        * Pass True, if the user can send audios, documents, photos, videos, video notes and voice notes, implies can_send_messages
        */
        val canSendMediaMessages: Boolean? = null,

        /**
        * Pass True, if the user can send animations, games, stickers and use inline bots, implies can_send_media_messages
        */
        val canSendOtherMessages: Boolean? = null,

        /**
        * Pass True, if the user may add web page previews to their messages, implies can_send_media_messages
        */
        val canAddWebPagePreviews: Boolean? = null
)
