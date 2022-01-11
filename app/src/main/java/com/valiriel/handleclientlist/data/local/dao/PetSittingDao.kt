package com.valiriel.handleclientlist.data.local.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.valiriel.handleclientlist.data.local.entity.PetSittingEntity

@Dao
interface PetSittingDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertPetSitting(petSittingEntity: PetSittingEntity): Boolean

    @Query("SELECT * FROM petsittingentity")
    suspend fun getPetSittings(): List<PetSittingEntity>

    @Query("SELECT * FROM petsittingentity WHERE id = :id")
    suspend fun getPetSittingById(id: String): PetSittingEntity

    @Update
    suspend fun updatePetSitting(petSittingEntity: PetSittingEntity): Boolean

    @Delete
    suspend fun deletePetSitting(petSittingEntity: PetSittingEntity): Boolean
}