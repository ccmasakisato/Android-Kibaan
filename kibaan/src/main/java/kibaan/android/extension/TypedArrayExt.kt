package kibaan.android.extension

import android.content.res.TypedArray

fun TypedArray.getStringOrNull(id: Int): String? {
    return if (hasValue(id)) getString(id) else null
}