package Coroutines

import kotlinx.coroutines.*

suspend fun main() {
   execute()
}

suspend fun execute(){


    var parentJob = GlobalScope.launch(Dispatchers.IO){

        println("Parent Started")

        var childJob = launch {

            println("Child Started")
            delay(5000)
            println("Child Ended")

        }

        delay(3000)
        println("Parent Ended")

    }
    parentJob.join()
    println("Parent Completed")

}
