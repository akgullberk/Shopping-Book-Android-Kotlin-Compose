package com.example.shoppingbook.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.example.shoppingbook.roomdb.ItemDatabase

class ItemViewModel(application: Application) : AndroidViewModel(application) {

    private val db = Room.databaseBuilder(
        getApplication(),
        ItemDatabase::class.java,"Items"
    ).build()

    private val itemDao = db.userDao()

    fun getItems(){
        itemDao.getItemWithNameAndId()
    }
}