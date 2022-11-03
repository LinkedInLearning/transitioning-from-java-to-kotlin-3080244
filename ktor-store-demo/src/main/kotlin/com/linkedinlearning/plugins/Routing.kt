package com.linkedinlearning.plugins

import com.linkedinlearning.model.IN_MEMORY_PRODUCTS
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {

        get("/") {
            call.respondText("Hello Ktor!!!!")
        }

        get("/products") {
            call.respond(IN_MEMORY_PRODUCTS)
        }
    }
}
