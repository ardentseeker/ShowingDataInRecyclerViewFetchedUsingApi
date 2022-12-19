package com.example.retrofit

import com.example.retrofit.model.Posts
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitApi {

    @GET("/posts")
    fun getAllPosts():Call<List<Posts>>
}