package Coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {

    execute2()

}

suspend fun execute2(){


    var parentJob = GlobalScope.launch(Dispatchers.IO){

        println("Parent Started")

        var childJob = launch {

            println("Child Started")
            delay(5000)
            println("Child Ended")

        }


        delay(3000)
        childJob.cancel() // Now we had cancelled child job and set a timer of 3sec.
        println("Child Job Cancelled")
        println("Parent Ended")

    }
    parentJob.join()
    println("Parent Completed")

}