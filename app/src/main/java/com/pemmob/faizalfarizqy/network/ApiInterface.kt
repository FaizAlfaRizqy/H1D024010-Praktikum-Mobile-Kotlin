package com.pemmob.faizalfarizqy.network

import com.pemmob.faizalfarizqy.data.model.Category
import com.pemmob.faizalfarizqy.data.model.Product
import com.pemmob.faizalfarizqy.util.JualanConstans
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("data/categories.json")
    suspend fun getCategories(): List<Category>

    @GET("data/products.json")
    suspend fun getProducts(): List<Product>
}

object ApiClient {
    val instance: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(JualanConstans.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}
