package com.example.bukutabungan.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.bukutabungan.data.model.DataNama
import com.example.bukutabungan.data.model.DataTabungan
import com.example.bukutabungan.data.util.Converters

@Database(
    entities = [DataTabungan::class, DataNama::class],
    version = 1)
@TypeConverters(Converters::class)
abstract class BukuTabunganDB : RoomDatabase() {
    abstract fun bukuTabunganDao() : BukuTabunganDao

    companion object {
        @Volatile
        private var instance: BukuTabunganDB? = null

        @JvmStatic
        fun getInstance(context: Context) : BukuTabunganDB {
            if (instance == null) {
                synchronized(BukuTabunganDB::class.java) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        BukuTabunganDB::class.java,
                        "buku_tabungan"
                    ).build()
                }
            }
            return instance as BukuTabunganDB
        }
    }
}