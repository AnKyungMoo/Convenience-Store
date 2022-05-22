package com.km.convenience_store.data.service

import com.km.convenience_store.data.dto.requestbody.ProductRequestBody
import com.km.convenience_store.data.dto.responsebody.ProductResponseBody
import retrofit2.http.Body
import retrofit2.http.POST

interface ConvenienceStoreService {
    @POST("/api/conveniences/products")
    suspend fun getProducts(@Body productRequestBody: ProductRequestBody): ProductResponseBody
}