package com.valiriel.handleclientlist.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.valiriel.handleclientlist.common.Converters
import com.valiriel.handleclientlist.data.local.dao.AnimalDao
import com.valiriel.handleclientlist.data.local.dao.ClientDao
import com.valiriel.handleclientlist.data.local.dao.PetSittingDao
import com.valiriel.handleclientlist.data.local.entity.AnimalEntity
import com.valiriel.handleclientlist.data.local.entity.ClientEntity
import com.valiriel.handleclientlist.data.local.entity.PetSittingEntity

@Database(
    entities = [
        AnimalEntity::class,
        ClientEntity::class,
        PetSittingEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class ClientsDatabase: RoomDatabase() {
    abstract fun animalDao(): AnimalDao
    abstract fun clientDao(): ClientDao
    abstract fun petSittingDao(): PetSittingDao
}