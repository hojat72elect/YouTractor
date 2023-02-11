package ca.on.hojat.youtractor

/**
 * @param itag : An identifier used by YouTube for different formats.
 * @param ext : The file extension and container format (such as .mp4)
 * @param height : The pixel height of the video stream or -1 for audio files.
 * @param fps : The frames per second for the video.
 * @param audioBitRate : Audio bitrate in KBit/s or -1 if there's no audio track.
 */
data class Format(
    val itag: Int,
    val ext: String,
    val height: Int = -1,
    val fps: Int = 30,
    var videoCodec: VideoCodec,
    var audioCodec: AudioCodec,
    val audioBitRate: Int = -1,
    val isDashContainer: Boolean,
    val isHlsContent: Boolean = false,
)







