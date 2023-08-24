package com.solar.evafinal.model

import com.google.gson.annotations.SerializedName

data class Country(


    @SerializedName("character")
    val common: String,

    @SerializedName("image")
    val svg: String
)