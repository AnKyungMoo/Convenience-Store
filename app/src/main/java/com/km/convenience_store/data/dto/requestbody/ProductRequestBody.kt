package com.km.convenience_store.data.dto.requestbody

import com.google.gson.annotations.SerializedName

data class ProductRequestBody(
    @SerializedName("page") val page: Int,
    @SerializedName("sale_type") val saleType: String,
    @SerializedName("size") val size: Int,
    @SerializedName("store") val store: String,
    @SerializedName("title") val title: String
)
