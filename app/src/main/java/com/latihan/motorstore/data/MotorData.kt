package com.latihan.motorstore.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MotorData(
    val name: String,
    val price: String,
    val color: String,
    val engine: String,
    val star: String,
    val overview: String,
    val image: String

) : Parcelable
