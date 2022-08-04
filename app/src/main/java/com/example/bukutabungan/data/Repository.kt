package com.example.bukutabungan.data

import android.app.Application
import com.example.bukutabungan.data.local.BukuTabunganDB
import com.example.bukutabungan.data.local.BukuTabunganDao

class Repository(private val application: Application) {
    private val dao: BukuTabunganDao

    init {
        val database: BukuTabunganDB = BukuTabunganDB.getInstance(application)
        dao = database.bukuTabunganDao()
    }
}