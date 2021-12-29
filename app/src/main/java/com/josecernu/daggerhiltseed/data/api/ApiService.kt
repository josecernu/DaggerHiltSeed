package com.josecernu.daggerhiltseed.data.api

import com.josecernu.daggerhiltseed.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}