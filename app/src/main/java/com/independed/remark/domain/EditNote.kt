package com.independed.remark.domain

import com.independed.remark.`interface`.NoteListRepository

class EditNote(private val noteListRepository: NoteListRepository) {
    fun editNote(noteItem: NoteItem){
        noteListRepository.editNote(noteItem)
    }
}