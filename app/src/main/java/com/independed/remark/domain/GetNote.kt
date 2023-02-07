package com.independed.remark.domain

import com.independed.remark.`interface`.NoteListRepository

class GetNote(private val noteListRepository: NoteListRepository) {
    fun getNote(noteItem: NoteItem){
        noteListRepository.getNote(noteItem)
    }
}