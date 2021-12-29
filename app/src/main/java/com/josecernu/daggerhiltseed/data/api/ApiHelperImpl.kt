package com.josecernu.daggerhiltseed.data.api

import com.josecernu.daggerhiltseed.data.model.User
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper{
    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()
}