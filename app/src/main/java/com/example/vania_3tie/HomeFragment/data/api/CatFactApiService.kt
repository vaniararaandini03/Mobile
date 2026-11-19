package com.example.vania_3tie.HomeFragment.data.api

import com.example.vania_3tie.HomeFragment.data.model.CatFactModel
import retrofit2.http.GET

interface CatFactApiService {
    @GET("fact")
    suspend fun getCatFact(): CatFactModel
}