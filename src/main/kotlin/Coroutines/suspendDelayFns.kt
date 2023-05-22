package Coroutines

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {

    launch {
        Task3()
    }

    print("Hello")

}

suspend fun Task3(){

    println(" World!")
    delay(1000)


}
