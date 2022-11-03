package com.linkedinlearning.plugins

import io.ktor.server.application.*
import io.ktor.server.auth.*

fun Application.configureAuthentication() {
    install(Authentication) {
        basic {
            validate { credentials ->
                if (credentials.name == "linkedin" && credentials.password == "learning") {
                    UserIdPrincipal(credentials.name)
                } else {
                    null
                }
            }
        }
    }
}