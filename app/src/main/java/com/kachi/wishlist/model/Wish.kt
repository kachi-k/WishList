package com.kachi.wishlist.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 *   Created by OLABODE WILSON on 8/20/20.
 */


/**
 * This class represents a single wish, in our use case a wish has
 * two properties a title(which is a string ) and a date (which is also a string)
 */

@Parcelize
data class Wish(
    val title: String,
    val date: String
) : Parcelable

