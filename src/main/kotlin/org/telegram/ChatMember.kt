package org.telegram

data class ChatMember(
        /**
        * Information about the user
        */
        val user: User,

        /**
        * The member&#39;s status in the chat. Can be �creator�, �administrator�, �member�, �restricted�, �left� or �kicked�
        */
        val status: String,

        /**
        * Optional. Restricted and kicked only. Date when restrictions will be lifted for this user, unix time
        */
        val untilDate: Int? = null,

        /**
        * Optional. Administrators only. True, if the bot is allowed to edit administrator privileges of that user
        */
        val canBeEdited: Boolean? = null,

        /**
        * Optional. Administrators only. True, if the administrator can change the chat title, photo and other settings
        */
        val canChangeInfo: Boolean? = null,

        /**
        * Optional. Administrators only. True, if the administrator can post in the channel, channels only
        */
        val canPostMessages: Boolean? = null,

        /**
        * Optional. Administrators only. True, if the administrator can edit messages of other users and can pin messages, channels only
        */
        val canEditMessages: Boolean? = null,

        /**
        * Optional. Administrators only. True, if the administrator can delete messages of other users
        */
        val canDeleteMessages: Boolean? = null,

        /**
        * Optional. Administrators only. True, if the administrator can invite new users to the chat
        */
        val canInviteUsers: Boolean? = null,

        /**
        * Optional. Administrators only. True, if the administrator can restrict, ban or unban chat members
        */
        val canRestrictMembers: Boolean? = null,

        /**
        * Optional. Administrators only. True, if the administrator can pin messages, supergroups only
        */
        val canPinMessages: Boolean? = null,

        /**
        * Optional. Administrators only. True, if the administrator can add new administrators with a subset of his own privileges or demote administrators that he has promoted, directly or indirectly (promoted by administrators that were appointed by the user)
        */
        val canPromoteMembers: Boolean? = null,

        /**
        * Optional. Restricted only. True, if the user can send text messages, contacts, locations and venues
        */
        val canSendMessages: Boolean? = null,

        /**
        * Optional. Restricted only. True, if the user can send audios, documents, photos, videos, video notes and voice notes, implies can_send_messages
        */
        val canSendMediaMessages: Boolean? = null,

        /**
        * Optional. Restricted only. True, if the user can send animations, games, stickers and use inline bots, implies can_send_media_messages
        */
        val canSendOtherMessages: Boolean? = null,

        /**
        * Optional. Restricted only. True, if user may add web page previews to his messages, implies can_send_media_messages
        */
        val canAddWebPagePreviews: Boolean? = null
)
