package Coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {

    execute1()

}

suspend fun execute1(){


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
    delay(1000)
    parentJob.cancel() // We had set an instruction that when we get to 1 sec we will cancel the parent job,
                       // and because of this all the child jobs will also be going to be cancelled.
    parentJob.join()
    println("Parent Completed")

}