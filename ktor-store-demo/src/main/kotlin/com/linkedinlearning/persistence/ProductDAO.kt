package com.linkedinlearning.persistence

import com.linkedinlearning.model.Product
import kotlinx.coroutines.Dispatchers
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction

class ProductDAO {
    suspend fun products(): List<Product> {
        TODO()
    }

    suspend fun addProduct(product: Product): Product? {
        TODO()
    }

    private fun ResultRow.toProduct(): Product {
        TODO()
    }

    private suspend fun <T> query(block: suspend () -> T): T =
        newSuspendedTransaction(Dispatchers.IO) { block() }
}