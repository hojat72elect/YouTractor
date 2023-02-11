package ca.on.hojat.youtractor

/**
 * All the different video codecs that we support.
 */
sealed class VideoCodec {
    object H263 : VideoCodec()
    object H264 : VideoCodec()
    object MPEG4 : VideoCodec()
    object VP8 : VideoCodec()
    object VP9 : VideoCodec()
    object NONE : VideoCodec()
}