package com.josecernu.daggerhiltseed.data.api

import com.josecernu.daggerhiltseed.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>

}