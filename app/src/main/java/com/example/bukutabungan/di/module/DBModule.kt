package com.example.bukutabungan.di.module

import android.app.Application
import com.example.bukutabungan.data.local.BukuTabunganDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DBModule {

    @Singleton
    @Provides
    fun provideDatabase(application: Application) = BukuTabunganDB.getInstance(application)

    @Singleton
    @Provides
    fun provideBukuTabunganDao(database: BukuTabunganDB) = database.bukuTabunganDao()
}