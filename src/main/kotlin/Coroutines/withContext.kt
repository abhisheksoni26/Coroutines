package Coroutines

import kotlinx.coroutines.*

suspend fun main() {

//    executeWithoutContext()

    executeWithContext()

}

suspend fun executeWithContext(){

    println("Before")
    withContext(Dispatchers.IO){ // This will finish the coroutine first then it will jump to below code

        println("Inside")

    }
    println("After")

}

suspend fun executeWithoutContext(){

    println("Before")

    GlobalScope.launch {
        delay(1000)
        println("Inside")
    }

    println("After")

}