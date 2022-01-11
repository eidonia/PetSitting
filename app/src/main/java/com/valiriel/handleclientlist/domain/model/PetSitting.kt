package com.valiriel.handleclientlist.domain.model

data class PetSitting(
    val id: Long = 0,
    val client: Client? = null,
    val numVisits: Int?,
    val dateBegin: Long?,
    val dateEnd: Long?,
    val numBill: Int?,
    val price: Float?
)
