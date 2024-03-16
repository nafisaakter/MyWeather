package com.example.myweather.utils


import com.example.myweather.data.ApiInterface
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
object RetrofitInstance {
    private const val API_KEY = "a7392fe21397dc558d7de202698bf538"

    val api: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(Util.Base)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }

    fun getApiKey(): String {
        return API_KEY
    }
}