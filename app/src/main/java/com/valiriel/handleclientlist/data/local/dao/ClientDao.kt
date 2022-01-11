package com.valiriel.handleclientlist.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import com.valiriel.handleclientlist.data.local.entity.ClientEntity

@Dao
interface ClientDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertClient(client: ClientEntity)

    @Query("SELECT * FROM cliententity")
    suspend fun getListClients()

    @Query("SELECT * FROM cliententity WHERE id = :id")
    suspend fun getClientById(id: Long)

    @Update
    suspend fun updateClient(client: ClientEntity)

}