package com.valiriel.handleclientlist.data.local.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.valiriel.handleclientlist.data.local.entity.ClientEntity

@Dao
interface ClientDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertClient(client: ClientEntity): Boolean

    @Query("SELECT * FROM cliententity")
    suspend fun getClients(): List<ClientEntity>

    @Query("SELECT * FROM cliententity WHERE id = :id")
    suspend fun getClientById(id: String): ClientEntity

    @Update
    suspend fun updateClient(client: ClientEntity): Boolean

    @Delete
    suspend fun deleteClient(client: ClientEntity): Boolean

}