package com.valiriel.handleclientlist.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.NO_ACTION
import androidx.room.PrimaryKey
import com.valiriel.handleclientlist.domain.model.PetSitting

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = ClientEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("client"),
            onDelete = NO_ACTION
        )
    ]
)
data class PetSittingEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val client: Long?,
    val numVisits: Int?,
    val dateBegin: Long?,
    val dateEnd: Long?,
    val numBill: Int?,
    val price: Float?
)

fun PetSittingEntity.toPetSitting() = PetSitting(
    numVisits = numVisits,
    dateBegin = dateBegin,
    dateEnd = dateEnd,
    numBill = numBill,
    price = price
)


