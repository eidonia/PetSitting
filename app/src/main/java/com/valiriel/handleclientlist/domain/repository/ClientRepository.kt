package com.valiriel.handleclientlist.domain.repository

import com.valiriel.handleclientlist.data.local.entity.AnimalEntity
import com.valiriel.handleclientlist.data.local.entity.ClientEntity

interface ClientRepository {
    suspend fun insertClient(clientEntity: ClientEntity): Boolean
    suspend fun getClients(): List<ClientEntity>
    suspend fun getClientById(id: String): ClientEntity
    suspend fun updateClient(clientEntity: ClientEntity): Boolean
    suspend fun deleteClient(clientEntity: ClientEntity): Boolean
    suspend fun getAnimalById(id: String): AnimalEntity
}