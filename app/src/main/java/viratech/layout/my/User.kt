package viratech.layout.my

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(


    var name:String,
    var description:String,
    var photo:Int


):Parcelable
