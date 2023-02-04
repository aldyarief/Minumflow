package com.example.minumflow.model

import com.google.gson.annotations.SerializedName

data class SO(

    @field:SerializedName("totalResults")
    val totalResults: Int? = null,

    @field:SerializedName("articles")
    val articles: List<SO?>? = null,

    @field:SerializedName("status")
    val status: String? = null
)