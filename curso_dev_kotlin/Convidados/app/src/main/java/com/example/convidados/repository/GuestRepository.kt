package com.example.convidados.repository

import android.content.ContentValues
import android.content.Context
import com.example.convidados.model.GuestModel

class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    // Singleton
    companion object {

        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!Companion::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            return repository
        }

    }

    fun insert(guest: GuestModel){
        val db = guestDataBase.writableDatabase

        val presence = if (guest.presence) 1 else 0

        val values = ContentValues()
        values.put("name", guest.name)
        values.put("presence", presence)

        db.insert("Guest", null, values)
    }
}