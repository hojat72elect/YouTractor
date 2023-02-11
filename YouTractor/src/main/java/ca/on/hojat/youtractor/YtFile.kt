package ca.on.hojat.youtractor

/**
 * @param url : the URL to download the file.
 * @param format: Format data for any specific file.
 */
data class YtFile(
    val format: Format,
    val url: String
)