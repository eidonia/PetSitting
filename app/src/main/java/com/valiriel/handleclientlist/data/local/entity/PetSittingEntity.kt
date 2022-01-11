package com.valiriel.handleclientlist.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.NO_ACTION
import androidx.room.PrimaryKey
import com.valiriel.handleclientlist.domain.model.PetSitting

@Entity
data class PetSittingEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String?,
    var client: String?,
    var numVisits: Int?,
    var dateBegin: Long?,
    var dateEnd: Long?,
    var numBill: Int?,
    var price: Float?
)

fun PetSittingEntity.toPetSitting() = PetSitting(
    id = id,
    numVisits = numVisits,
    dateBegin = dateBegin,
    dateEnd = dateEnd,
    numBill = numBill,
    price = price
)


