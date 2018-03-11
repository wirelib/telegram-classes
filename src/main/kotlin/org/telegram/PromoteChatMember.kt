package org.telegram

data class PromoteChatMember(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Unique identifier of the target user
        */
        val userId: Int,

        /**
        * Pass True, if the administrator can change chat title, photo and other settings
        */
        val canChangeInfo: Boolean? = null,

        /**
        * Pass True, if the administrator can create channel posts, channels only
        */
        val canPostMessages: Boolean? = null,

        /**
        * Pass True, if the administrator can edit messages of other users and can pin messages, channels only
        */
        val canEditMessages: Boolean? = null,

        /**
        * Pass True, if the administrator can delete messages of other users
        */
        val canDeleteMessages: Boolean? = null,

        /**
        * Pass True, if the administrator can invite new users to the chat
        */
        val canInviteUsers: Boolean? = null,

        /**
        * Pass True, if the administrator can restrict, ban or unban chat members
        */
        val canRestrictMembers: Boolean? = null,

        /**
        * Pass True, if the administrator can pin messages, supergroups only
        */
        val canPinMessages: Boolean? = null,

        /**
        * Pass True, if the administrator can add new administrators with a subset of his own privileges or demote administrators that he has promoted, directly or indirectly (promoted by administrators that were appointed by him)
        */
        val canPromoteMembers: Boolean? = null
)
