@file:JvmName("ProductConverters")
package com.linkedinlearning.springbootstoredemo.ui.converters

import com.linkedinlearning.springbootstoredemo.model.Product
import com.linkedinlearning.springbootstoredemo.ui.ProductViewItem

fun Product.productToProductViewItem(): ProductViewItem {
    return ProductViewItem(
        name,
        description,
        thumbnail,
        "$type:${upc}"
    )
}