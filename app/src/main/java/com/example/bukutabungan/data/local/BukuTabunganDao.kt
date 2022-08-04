package com.example.bukutabungan.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.bukutabungan.data.model.DataTabungan

@Dao
interface BukuTabunganDao {

    @Query("SELECT nama_lengkap from data_nama")
    suspend fun ambilTabungan(): List<String>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMasuk(dataTabungan: DataTabungan)
}