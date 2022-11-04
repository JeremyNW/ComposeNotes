package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "one", description = "one"),
            Note(title = "two", description = "two"),
             Note(title = "three", description = "three"),
             Note(title = "four", description = "four"),
             Note(title = "five", description = "five")

        )
    }
}