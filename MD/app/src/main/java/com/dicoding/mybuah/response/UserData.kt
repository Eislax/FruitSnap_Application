package com.dicoding.mybuah.response

import android.os.Parcel
import android.os.Parcelable

data class UserData (
    var  userToken: String?,
    var userName: String?,
    var userPass: String?

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(userToken)
        parcel.writeString(userName)
        parcel.writeString(userPass)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UserData> {
        override fun createFromParcel(parcel: Parcel): UserData {
            return UserData(parcel)
        }

        override fun newArray(size: Int): Array<UserData?> {
            return arrayOfNulls(size)
        }
    }

    fun token(): String? {
        return userToken
    }
}