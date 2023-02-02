package com.independed.remark.domain

import com.independed.remark.`interface`.NoteListRepository

class AddNote(private val noteListRepository: NoteListRepository) {
    fun addNote(noteItem: NoteItem){
        noteListRepository.addNote(noteItem)
    }
}