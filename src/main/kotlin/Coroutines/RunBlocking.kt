package Coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking{

    launch {

        delay(1000)
        println("Abhishek!")

    }
    println("Hello")

}