package com.linkedinlearning.springbootstoredemo

import com.linkedinlearning.springbootstoredemo.model.Product
import com.linkedinlearning.springbootstoredemo.service.ProductService
import com.linkedinlearning.springbootstoredemo.ui.converters.productToProductViewItem
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView
import java.util.Map

/**
 * Controls the public-facing storefront for browsing available products
 */
@Controller
class StorefrontController {

    @Autowired
    lateinit var productService: ProductService

    @GetMapping("/storefront")
    fun showProducts(): ModelAndView {
        val products = productService.allProducts()
        val productViewItems = products.map { product -> product.productToProductViewItem() }
        return ModelAndView("Storefront", Map.of("products", productViewItems.toList()))
    }
}