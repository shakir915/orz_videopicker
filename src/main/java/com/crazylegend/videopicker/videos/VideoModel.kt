package com.crazylegend.videopicker.videos

import android.net.Uri
import android.os.Parcelable
import com.crazylegend.core.dto.BaseCursorModel
import kotlinx.parcelize.Parcelize


/**
 * Simple data class to hold information about an image included in the device's MediaStore.
 */

@Parcelize
data class VideoModel(
        override val id: Long,
        override val displayName: String?,
        override val dateAdded: Long?,
        override val contentUri: Uri,
        override val dateModified: Long?,
        override val description: String?,
        override val size: Int?,
        override val width: Int?,
        override val height: Int?,
        val resolution: String?,
        val private: Int?,
        val tags: String?
) : BaseCursorModel(id, displayName, dateAdded, contentUri, dateModified, description, size, width, height), Parcelable {


}