package com.valiriel.handleclientlist.domain.model

import com.valiriel.handleclientlist.data.local.entity.PetSittingEntity
import kotlin.random.Random

data class PetSitting(
    var client: Client? = null,
    var numVisits: Int?,
    var dateBegin: Long?,
    var dateEnd: Long?,
    var numBill: Int?,
    var price: Float?,
    val id: String? = client?.name + numBill + Random.nextInt(0,1000)
)

fun PetSitting.toPetSittingEntity() = PetSittingEntity(
    id = id,
    client = client?.id,
    numVisits = numVisits,
    dateBegin = dateBegin,
    dateEnd = dateEnd,
    numBill = numBill,
    price = price
)
