package com.valiriel.handleclientlist.domain.repository

import com.valiriel.handleclientlist.data.local.entity.PetSittingEntity

interface PetSittingRepository {
    suspend fun insertPetSitting(petSittingEntity: PetSittingEntity): Boolean
    suspend fun getPetSittings(): List<PetSittingEntity>
    suspend fun getPetSittingById(id: String): PetSittingEntity
    suspend fun updatePetSitting(petSittingEntity: PetSittingEntity): Boolean
    suspend fun deletePetSitting(petSittingEntity: PetSittingEntity): Boolean
}