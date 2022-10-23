package com.example.room

import io.ktor.http.cio.websocket.*

data class Members(
    val username:String,
    val sessionId: String,
    val socket: WebSocketSession
)
