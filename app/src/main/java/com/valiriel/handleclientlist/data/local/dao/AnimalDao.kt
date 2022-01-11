package com.valiriel.handleclientlist.data.local.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.valiriel.handleclientlist.data.local.entity.AnimalEntity

@Dao
interface AnimalDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertAnimal(animal: AnimalEntity): Boolean

    @Query("SELECT * FROM animalentity WHERE id = :id")
    suspend fun getAnimalById(id: String): AnimalEntity

    @Query("SELECT * FROM animalentity")
    suspend fun getAnimals(): List<AnimalEntity>

    @Update
    suspend fun updateAnimal(animal: AnimalEntity): Boolean

    @Delete
    suspend fun deleteAnimal(animal: AnimalEntity): Boolean
}