package com.example.bukutabungan.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "data_tabungan")
@Parcelize
data class DataTabungan(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "nama")
    val nama: String,

    @ColumnInfo(name = "tanggal")
    val tanggal: Long,

    @ColumnInfo(name = "masuk")
    val masuk: Long,

    @ColumnInfo(name = "keluar")
    val keluar: Long,

    @ColumnInfo(name = "tanda_terima")
    val tandaTerima: String
) : Parcelable

@Entity(tableName = "data_nama")
@Parcelize
data class DataNama(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "nama_awal")
    val namaAwal: String,

    @ColumnInfo(name = "nama_akhir")
    val namaAkhir: String,

    @ColumnInfo(name = "nama_lengkap")
    val namaLengkap: String
) : Parcelable
