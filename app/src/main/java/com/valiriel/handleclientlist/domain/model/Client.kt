package com.valiriel.handleclientlist.domain.model

class Client(
    val id: Long = 0,
    val name: String?,
    val phoneNumber: String?,
    val email: String?,
    val address: Address?,
    val animal: MutableList<Animal> = mutableListOf(),
    val veterinary: Person?,
    val emergencyContact: Person?,
    val informationsEntity: Informations?
)

data class Address(
    val street: String?,
    val zipCode: String?,
    val city: String?
)

data class Person(
    val name: String?,
    val phoneNumber: String?
)

data class Informations(
    val petRide: Boolean?,
    val forbiddenRoom: String?,
    val food: String?,
    val drink: String?,
    val frequency: String?,
    val hoursVisits: String?
)