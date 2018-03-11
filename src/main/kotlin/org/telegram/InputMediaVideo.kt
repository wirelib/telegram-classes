package org.telegram

data class InputMediaVideo(
        /**
        * Type of the result, must be video
        */
        val type: String,

        /**
        * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet, or pass &quot;attach://&lt;file_attach_name&gt;&quot; to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name. More info on Sending Files �
        */
        val media: String,

        /**
        * Optional. Caption of the video to be sent, 0-200 characters
        */
        val caption: String? = null,

        /**
        * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
        */
        val parseMode: String? = null,

        /**
        * Optional. Video width
        */
        val width: Int? = null,

        /**
        * Optional. Video height
        */
        val height: Int? = null,

        /**
        * Optional. Video duration
        */
        val duration: Int? = null,

        /**
        * Optional. Pass True, if the uploaded video is suitable for streaming
        */
        val supportsStreaming: Boolean? = null
): InputMedia
