package com.linkedinlearning.springbootstoredemo.ui.converters;

import com.linkedinlearning.springbootstoredemo.model.Product;
import com.linkedinlearning.springbootstoredemo.ui.ProductViewItem;

public class ProductToProductViewItemConverter {
    public static ProductViewItem productToProductViewItem(Product product) {
        return new ProductViewItem(
                product.getName(),
                product.getDescription(),
                product.getThumbnail(),
                product.getType() + ":" + product.getUpc()
        );
    }
}
