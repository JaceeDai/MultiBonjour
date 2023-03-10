package com.example.bonjour

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform