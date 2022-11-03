package com.linkedinlearning.springbootstoredemo.model

import java.util.*

/**
 * A product available in the store
 */
data class Product(
    var upc: Long = 0,
    var name: String = "",
    var type: String ="",
    var description: String = "",
    var thumbnail: String = ""
)