package Coroutines.FlowsExamples.Example1

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow

data class Note(val id: Int, val isActive: Boolean, val title: String, val description: String)
data class FormattedNote(val isActive: Boolean, val title: String, val description: String)

fun getNotes(): Flow<Note>{
    val list = listOf(
        Note(1, true, "First", "Hello First"),
        Note(2, true, "Second", "Hello Second"),
        Note(3, false, "Third", "Hello Third")
        )
    return list.asFlow()
}
