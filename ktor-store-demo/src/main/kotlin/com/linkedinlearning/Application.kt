package com.linkedinlearning

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.linkedinlearning.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureCalLogging()
        configureContentNegotiation()
        configureAuthentication()
    }.start(wait = true)
}
