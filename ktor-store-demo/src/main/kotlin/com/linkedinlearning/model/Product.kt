package com.linkedinlearning.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val upc: String,
    val name: String,
    val description: String
)

val IN_MEMORY_PRODUCTS = listOf(
    Product("abc123", "Travel Backpack 20L", "A mis-sized backpack for your travel needs"),
    Product("aabbcc", "Passport Protector", "Keep your passport safe"),
    Product("123456", "Fancy Carry On Bag", "A stylish carry on back for all your travels")
)