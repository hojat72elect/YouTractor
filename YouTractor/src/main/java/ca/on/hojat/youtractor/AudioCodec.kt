package ca.on.hojat.youtractor

/**
 * Different types of audio codec that we support.
 */
sealed class AudioCodec {
    object MP3 : AudioCodec()

    object AAC : AudioCodec()

    object VORBIS : AudioCodec()

    object OPUS : AudioCodec()

    object NONE : AudioCodec()
}