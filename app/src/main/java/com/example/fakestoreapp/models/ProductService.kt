package com.example.fakestoreapp.models

import com.example.fakestoreapp.models.Product
import retrofit2.http.GET
import retrofit2.http.Path

// una interfaz es una contrato que una clase debe de seguir
interface ProductService {

    @GET("products")
    suspend fun getProducts() : List<Product>

    @GET("product/{id}")
    suspend fun getProductById(@Path("id") id: Int) : Product



}