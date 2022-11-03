package com.linkedinlearning.plugins

import com.linkedinlearning.model.Product
import com.linkedinlearning.persistence.ProductDatabase
import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.request.*
import io.ktor.server.response.*

fun Application.configureRouting() {
    routing {

        get("/") {
            call.respondText("Hello Ktor!!!!")
        }

        get("/products") {
            call.respond(ProductDatabase.dao.products())
        }

        authenticate {
            post("/add-product") {
                val body = call.receive<Product>()

                when(val insertedProduct = ProductDatabase.dao.addProduct(body)) {
                    null -> call.respondText("Failed to add product: $body", status = HttpStatusCode.InternalServerError)
                    else -> call.respondText("Added product: $body", status = HttpStatusCode.Created)
                }

            }
        }
    }
}
