package com.linkedinlearning.springbootstoredemo;

import com.linkedinlearning.springbootstoredemo.service.ProductService;
import com.linkedinlearning.springbootstoredemo.ui.converters.ProductToProductViewItemConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Controls the public-facing storefront for browsing available products
 */
@Controller
public class StorefrontController {

    @Autowired ProductService productService;

    @GetMapping("/storefront")
    public ModelAndView showProducts() {
        var products = productService.allProducts();
        var productViewItems = products.stream()
                .map(ProductToProductViewItemConverter::productToProductViewItem);
        return new ModelAndView("Storefront", Map.of("products", productViewItems.toList()));
    }
}
