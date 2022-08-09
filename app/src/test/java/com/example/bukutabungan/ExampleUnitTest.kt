package com.example.bukutabungan

import android.content.Context
import androidx.room.Room
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.bukutabungan.data.local.BukuTabunganDB
import com.example.bukutabungan.data.local.BukuTabunganDao
import com.example.bukutabungan.data.model.DataTabungan
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.io.IOException
import java.lang.Exception
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(JUnit4::class)
class ExampleUnitTest {
    private lateinit var dao: BukuTabunganDao
    private lateinit var db: BukuTabunganDB

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun createDB() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, BukuTabunganDB::class.java
        ).build()
    }

    @After
    @Throws(IOException::class)
    fun closeDB() = db.close()

    @Test
    @Throws(Exception::class)
    fun dbInsertTest() {
        val dataTabungan = DataTabungan(
            id = 0,
            nama = "Ucok",
            tanggal = System.currentTimeMillis(),
            masuk = 100_000,
            keluar = 0,
            tandaTerima = "Ok"
        )
        runBlocking {
            dao.insertMasuk(dataTabungan)
        }
    }
}