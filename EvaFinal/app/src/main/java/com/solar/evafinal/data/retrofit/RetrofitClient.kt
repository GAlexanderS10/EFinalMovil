package com.solar.evafinal.data.retrofit

import com.google.gson.GsonBuilder
import com.solar.evafinal.data.service.CountryService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val countryService: CountryService by lazy{
        Retrofit.Builder()
            .baseUrl(Constantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(CountryService::class.java)
    }
}