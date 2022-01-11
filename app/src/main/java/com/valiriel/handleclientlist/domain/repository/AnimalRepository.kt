package com.valiriel.handleclientlist.domain.repository

import com.valiriel.handleclientlist.data.local.entity.AnimalEntity
import com.valiriel.handleclientlist.data.local.entity.ClientEntity

interface AnimalRepository {
    suspend fun insertAnimal(animalEntity: AnimalEntity): Boolean
    suspend fun getAnimals(): List<AnimalEntity>
    suspend fun getAnimalById(id: String): AnimalEntity
    suspend fun updateAnimal(animalEntity: AnimalEntity): Boolean
    suspend fun deleteAnimal(animalEntity: AnimalEntity): Boolean
    suspend fun getClientById(id: String): ClientEntity
}