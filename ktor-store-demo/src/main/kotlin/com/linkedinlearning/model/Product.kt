package com.linkedinlearning.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val upc: Int,
    val name: String,
    val description: String
)

val IN_MEMORY_PRODUCTS = listOf(
    Product(123, "Travel Backpack 20L", "A mis-sized backpack for your travel needs"),
    Product(456, "Passport Protector", "Keep your passport safe"),
    Product(246, "Fancy Carry On Bag", "A stylish carry on back for all your travels")
)