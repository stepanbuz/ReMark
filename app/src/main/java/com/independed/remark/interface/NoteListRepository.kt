package com.independed.remark.`interface`

import com.independed.remark.domain.NoteItem

interface NoteListRepository {

    fun getNoteList(): List<NoteItem>

    fun getNote(noteItem: NoteItem)

    fun addNote(noteItem: NoteItem)

    fun editNote(noteItem: NoteItem)

    fun deleteNote(noteItem: NoteItem)
}