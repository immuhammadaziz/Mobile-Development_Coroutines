package org.example.question4

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun loadUser() {
    delay(100L)
    println("Load user")
}
fun main() = runBlocking {
    loadUser()
}