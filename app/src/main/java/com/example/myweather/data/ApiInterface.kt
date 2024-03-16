package com.example.myweather.data

import com.example.myweather.data.models.CurrentWeather
import com.example.myweather.utils.RetrofitInstance
import com.google.android.gms.common.api.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather?")
    suspend fun getCurrentWeather(
        @Query("q") city:String,
        @Query("units") units:String,
        @Query("appid") apiKey:String = RetrofitInstance.getApiKey(),
    ):retrofit2.Response<CurrentWeather>
}