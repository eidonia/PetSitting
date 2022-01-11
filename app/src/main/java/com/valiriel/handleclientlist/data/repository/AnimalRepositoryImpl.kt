package com.valiriel.handleclientlist.data.repository

import com.valiriel.handleclientlist.data.local.dao.AnimalDao
import com.valiriel.handleclientlist.data.local.dao.ClientDao
import com.valiriel.handleclientlist.data.local.entity.AnimalEntity
import com.valiriel.handleclientlist.data.local.entity.ClientEntity
import com.valiriel.handleclientlist.domain.repository.AnimalRepository
import javax.inject.Inject

class AnimalRepositoryImpl @Inject constructor(private val animalDao: AnimalDao, private val  clientDao: ClientDao): AnimalRepository{

    override suspend fun insertAnimal(animalEntity: AnimalEntity) = animalDao.insertAnimal(animalEntity)

    override suspend fun getAnimals() = animalDao.getAnimals()

    override suspend fun getAnimalById(id: String) = animalDao.getAnimalById(id)

    override suspend fun updateAnimal(animalEntity: AnimalEntity) = animalDao.updateAnimal(animalEntity)

    override suspend fun deleteAnimal(animalEntity: AnimalEntity) = animalDao.deleteAnimal(animalEntity)

    override suspend fun getClientById(id: String) = clientDao.getClientById(id)
}