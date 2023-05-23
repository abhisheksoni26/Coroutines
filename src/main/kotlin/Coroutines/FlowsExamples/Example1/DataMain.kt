package Coroutines.FlowsExamples.Example1

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.isActive
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    getNotes()
        .map {
            FormattedNote(it.isActive, it.title.uppercase(), it.description)
        }
        .filter {
            it.isActive
        }
        .collect{
            println(it.toString() + " ")
        }


}