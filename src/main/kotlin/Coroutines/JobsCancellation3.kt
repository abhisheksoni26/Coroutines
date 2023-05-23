package Coroutines

import kotlinx.coroutines.*

suspend fun main() {

    execute3()

}

suspend fun execute3(){


    val parentJob = CoroutineScope(Dispatchers.IO).launch{

            for (i in 1..1000) {
                if (isActive) {
                longRunningTask()
                println(i)
            }
        }


    }
    delay(1)
    parentJob.cancel()
    println("Cancelling Job")
    parentJob.join()
    println("Parent Completed")

}

fun longRunningTask(){

    for (i in 0..10000000){

    }

}