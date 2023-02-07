package com.independed.remark.domain

import com.independed.remark.`interface`.NoteListRepository

class GetNoteList(private val noteListRepository: NoteListRepository) {

    fun getNoteList(): List<NoteItem> {
      return noteListRepository.getNoteList()
    }
}