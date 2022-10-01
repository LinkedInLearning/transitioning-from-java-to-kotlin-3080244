package com.linkedinlearning.springbootstoredemo.service;

import com.linkedinlearning.springbootstoredemo.model.Product;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Encapsulates supported database interactions to be used by application controllers
 */
@Service
public class ProductService {

    @Autowired JdbcTemplate jdbcTemplate;

    public List<Product> allProducts() {
        String sql = "SELECT * FROM products";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
    }

    @NotNull
    public Product insert(Product product) {
        jdbcTemplate.update(
                "INSERT INTO products VALUES(?, ?, ?, ?, ?)",
                product.getUpc(),
                product.getName(),
                product.getType(),
                product.getDescription(),
                product.getThumbnail()
        );
        return product;
    }
}
