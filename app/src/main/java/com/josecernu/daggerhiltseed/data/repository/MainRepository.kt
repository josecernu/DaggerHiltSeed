package com.josecernu.daggerhiltseed.data.repository

import com.josecernu.daggerhiltseed.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper){
    suspend fun getUsers() =  apiHelper.getUsers()
}