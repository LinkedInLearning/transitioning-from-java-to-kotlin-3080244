package com.linkedinlearning.springbootstoredemo.service

import com.linkedinlearning.springbootstoredemo.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

/**
 * Encapsulates supported database interactions to be used by application controllers
 */
@Service
class ProductService {

    @Autowired
    lateinit var jdbcTemplate: JdbcTemplate

    fun allProducts(): List<Product> {
        val sql = "SELECT * FROM products"
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Product::class.java))
    }

    fun insert(product: Product): Product {
        jdbcTemplate.update(
            "INSERT INTO products VALUES(?, ?, ?, ?, ?)",
            product.upc,
            product.name,
            product.type,
            product.description,
            product.thumbnail
        )
        return product
    }
}