package com.valiriel.handleclientlist.common.di

import android.content.Context
import androidx.room.Room
import com.valiriel.handleclientlist.common.Converters
import com.valiriel.handleclientlist.data.local.ClientsDatabase
import com.valiriel.handleclientlist.data.local.dao.AnimalDao
import com.valiriel.handleclientlist.data.local.dao.ClientDao
import com.valiriel.handleclientlist.data.local.dao.PetSittingDao
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

class AppModule {

    @Provides
    @Singleton
    fun providesDatabase(@ApplicationContext context: Context): ClientsDatabase {
        return Room.databaseBuilder(context, ClientsDatabase::class.java, "client.db")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun providesAnimalDao(clientsDatabase: ClientsDatabase): AnimalDao {
        return clientsDatabase.animalDao()
    }

    @Provides
    @Singleton
    fun providesClientDao(clientsDatabase: ClientsDatabase): ClientDao {
        return clientsDatabase.clientDao()
    }

    @Provides
    @Singleton
    fun providesPetSittingDao(clientsDatabase: ClientsDatabase): PetSittingDao {
        return clientsDatabase.petSittingDao()
    }
}