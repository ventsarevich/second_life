package com.vintsarevich.secondlife.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Lab(

    @SerializedName("id")
    @Expose
    val id: Long,

    @SerializedName("name")
    @Expose
    val name: String
)