package com.valiriel.handleclientlist.domain.model


data class Animal(
    val id: Long?,
    val name: String?,
    val age: Int?,
    val treatment: Treatment?
)

data class Treatment(
    val name: String?,
    val instructions: String?
)
