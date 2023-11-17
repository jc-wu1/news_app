package com.julianc.newsapp.di

import android.app.Application
import com.julianc.newsapp.data.manger.LocalUserMangerImpl
import com.julianc.newsapp.domain.manger.LocalUserManger
import com.julianc.newsapp.domain.usecases.AppEntryUseCases
import com.julianc.newsapp.domain.usecases.ReadAppEntry
import com.julianc.newsapp.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManger = LocalUserMangerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManger
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )
}