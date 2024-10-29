package com.example.shoppingbook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shoppingbook.model.Item

@Database(entities = [Item::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun userDao(): ItemDao
}