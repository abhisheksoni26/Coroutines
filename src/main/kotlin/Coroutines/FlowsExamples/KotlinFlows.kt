package Coroutines.FlowsExamples

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    launch {

        val data: Flow<Int> = produce()
        data
            .onStart {
                emit(-1)
                println("Starting Out")
            }
            .onCompletion {
                emit(11)
                println("Completed")
            }
            .onEach {
                println("About to emit - $it")
            }
            .collect{
                println("$it")
            }

    }


}

fun produce() = flow<Int>{

    var list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    list.forEach {
        delay(1000)
        emit(it)
    }

}