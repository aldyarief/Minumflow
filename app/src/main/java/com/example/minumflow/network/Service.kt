package com.example.minumflow.network

import com.example.minumflow.model.SO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {
    @GET("/v2/everything?apiKey=51e875d26c204ae08a93a3112a90d6c1")
    fun getData(@Query("q") q :String): Call<SO>

    @GET("/v2/top-headlines?apiKey=51e875d26c204ae08a93a3112a90d6c1")
    fun getSearch(@Query("q") q :String,
                  @Query("title") title :String): Call<SO>
}