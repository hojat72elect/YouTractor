package ca.on.hojat.youtractor

import android.annotation.SuppressLint
import android.content.Context
import android.os.AsyncTask
import android.util.SparseArray
import java.lang.ref.WeakReference

@SuppressLint("StaticFieldLeak")
abstract class YouTubeExtractor(
    private val context: Context
) : AsyncTask<String, Unit, SparseArray<YtFile>>() {

    private val refContext = WeakReference(context)
    private val cacheDirPath = context.cacheDir.absolutePath

    private var videoId: String? = null

    companion object {
        const val CACHING = true
        const val LOGGING = false
        private const val LOG_TAG = "YouTubeExtractor"
        private const val CACHE_FILE_NAME = "decipher_js_funct"
    }
}