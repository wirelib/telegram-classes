package org.telegram

data class SendVideo(
        /**
        * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
        */
        val chatId: String,

        /**
        * Video to send. Pass a file_id as String to send a video that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get a video from the Internet, or upload a new video using multipart/form-data. More info on Sending Files �
        */
        val video: String,

        /**
        * Duration of sent video in seconds
        */
        val duration: Int? = null,

        /**
        * Video width
        */
        val width: Int? = null,

        /**
        * Video height
        */
        val height: Int? = null,

        /**
        * Video caption (may also be used when resending videos by file_id), 0-200 characters
        */
        val caption: String? = null,

        /**
        * Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
        */
        val parseMode: String? = null,

        /**
        * Pass True, if the uploaded video is suitable for streaming
        */
        val supportsStreaming: Boolean? = null,

        /**
        * Sends the message silently. Users will receive a notification with no sound.
        */
        val disableNotification: Boolean? = null,

        /**
        * If the message is a reply, ID of the original message
        */
        val replyToMessageId: Int? = null,

        /**
        * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
        */
        val replyMarkup: ReplyMarkup? = null
)
