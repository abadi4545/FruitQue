package com.example.fruitque.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fruit(
    val name: String,
    val price: String,
    val overview: String,
    val poster: String,
): Parcelable