package com.linkedinlearning.plugins

import com.linkedinlearning.persistence.ProductDatabase
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {
    routing {

        get("/") {
            call.respondText("Hello Ktor!!!!")
        }

        get("/products") {
            call.respond(ProductDatabase.dao.products())
        }
    }
}
