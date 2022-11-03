package com.linkedinlearning.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val upc: Int,
    val name: String,
    val description: String
)