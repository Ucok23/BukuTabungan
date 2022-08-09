package com.example.bukutabungan.data

import android.app.Application
import com.example.bukutabungan.data.local.BukuTabunganDB
import com.example.bukutabungan.data.local.BukuTabunganDao
import javax.inject.Inject

class Repository @Inject constructor(
    private val bukuTabunganDao: BukuTabunganDao
) {

}