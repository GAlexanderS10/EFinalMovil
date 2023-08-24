package com.solar.evafinal.data.service

import com.solar.evafinal.model.Country
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface CountryService {
    @GET("quotes?count=12")
    suspend fun getAllCountries(): Response<List<Country>>
}