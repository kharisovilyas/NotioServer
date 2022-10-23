package com.example.plugins

import com.example.data.model.Message

import io.ktor.features.*
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.serialization.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }

    /*routing {
        get("/json/gson") {
            call.respond(mapOf("hello" to "world"))
        }
        get("/message") {
            //call.respond(listMessage)
        }
        delete("/message/{id}") {
            val id = call.parameters["id"]?.toInt()
            /*if (id != null && id >= 0 && id < listMessage.size) {
                //listMessage.removeAt(id)
                call.respondText("delete correct!")
            }else{
                call.respondText("Index incorrect", status = HttpStatusCode.BadRequest)
            }*/
        }

        post("/message/add"){
            val message = call.receiveOrNull<Message>()
            if(message == null) {
                call.respondText("incorrect input", status = HttpStatusCode.BadRequest)
            }
            else{
                //listMessage.add(message)
                call.respondText("add correct")
            }
        }

    }*/
}
