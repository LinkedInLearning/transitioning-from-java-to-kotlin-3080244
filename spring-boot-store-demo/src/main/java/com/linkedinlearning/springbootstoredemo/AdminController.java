package com.linkedinlearning.springbootstoredemo;

import com.linkedinlearning.springbootstoredemo.model.Product;
import com.linkedinlearning.springbootstoredemo.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Controls the private admin portal for the site.
 * The admin area supports a minimal inventory view, and a form for adding new products
 */
@Controller
public class AdminController {

    @Autowired ProductService productService;
    private final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @GetMapping("/admin")
    public ModelAndView showProducts() {
        var products = productService.allProducts();
        return new ModelAndView("Admin", Map.of("products", products));
    }

    @GetMapping("/admin/new-product")
    public ModelAndView newProduct() {
        return new ModelAndView("ProductEntryForm");
    }

    @PostMapping("/admin/new-product")
    public String formPost(Product product, Model model) {
        var insertedProduct = productService.insert(product);
        logger.info("/admin/new-product -> ${insertedProduct.name}");

        model.addAttribute("product", insertedProduct);
        return "ProductEntryForm";
    }
}
