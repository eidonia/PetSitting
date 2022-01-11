package com.valiriel.handleclientlist.data.repository

import com.valiriel.handleclientlist.data.local.dao.PetSittingDao
import com.valiriel.handleclientlist.data.local.entity.PetSittingEntity
import com.valiriel.handleclientlist.domain.repository.PetSittingRepository
import javax.inject.Inject

class PetSittingRepositoryImpl @Inject constructor(private val petSittingDao: PetSittingDao): PetSittingRepository {
    override suspend fun insertPetSitting(petSittingEntity: PetSittingEntity) = petSittingDao.insertPetSitting(petSittingEntity)

    override suspend fun getPetSittings() = petSittingDao.getPetSittings()

    override suspend fun getPetSittingById(id: String) = petSittingDao.getPetSittingById(id)

    override suspend fun updatePetSitting(petSittingEntity: PetSittingEntity) = petSittingDao.updatePetSitting(petSittingEntity)

    override suspend fun deletePetSitting(petSittingEntity: PetSittingEntity) = petSittingDao.deletePetSitting(petSittingEntity)
}