package com.independed.remark.domain

import com.independed.remark.`interface`.NoteListRepository

class DeleteNote(private val noteListRepository: NoteListRepository) {
    fun deleteNote(noteItem: NoteItem){
        noteListRepository.deleteNote(noteItem)
    }
}