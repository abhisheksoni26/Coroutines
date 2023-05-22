package Coroutines

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {

   launch {

    Task1()

}

    launch {

        Task2()

    }

}

suspend fun Task1(){

    println("Start Task 1")
    yield()
    println("Ending Task 1")


}

suspend fun Task2(){

    println("Start Task 2")
    yield()
    println("Ending Task 2")


}