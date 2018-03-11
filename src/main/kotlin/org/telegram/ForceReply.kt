package org.telegram

data class ForceReply(
        /**
        * Shows reply interface to the user, as if they manually selected the bot�s message and tapped �Reply&#39;
        */
        val forceReply: Boolean,

        /**
        * Optional. Use this parameter if you want to force reply from specific users only. Targets: 1) users that are @mentioned in the text of the Message object; 2) if the bot&#39;s message is a reply (has reply_to_message_id), sender of the original message.
        */
        val selective: Boolean? = null
): ReplyMarkup
