package com.valiriel.handleclientlist.data.repository

import com.valiriel.handleclientlist.data.local.dao.AnimalDao
import com.valiriel.handleclientlist.data.local.dao.ClientDao
import com.valiriel.handleclientlist.data.local.entity.AnimalEntity
import com.valiriel.handleclientlist.data.local.entity.ClientEntity
import com.valiriel.handleclientlist.domain.repository.ClientRepository
import javax.inject.Inject

class ClientRepositoryImpl @Inject constructor(private val clientDao: ClientDao, private val animalDao: AnimalDao): ClientRepository {
    override suspend fun insertClient(clientEntity: ClientEntity) = clientDao.insertClient(clientEntity)

    override suspend fun getClients() = clientDao.getClients()

    override suspend fun getClientById(id: String) = clientDao.getClientById(id)

    override suspend fun updateClient(clientEntity: ClientEntity) = clientDao.updateClient(clientEntity)

    override suspend fun deleteClient(clientEntity: ClientEntity) = clientDao.deleteClient(clientEntity)

    override suspend fun getAnimalById(id: String) = animalDao.getAnimalById(id)
}