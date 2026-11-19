package com.example.vania_3tie.HomeFragment.data.api

import com.example.vania_3tie.HomeFragment.data.model.PhotoModel
import retrofit2.http.GET

interface PhotoApiService {
    @GET("list")
    suspend fun getPhotos(): List<PhotoModel>
}