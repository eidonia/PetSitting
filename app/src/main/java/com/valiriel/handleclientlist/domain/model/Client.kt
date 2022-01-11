package com.valiriel.handleclientlist.domain.model

import com.valiriel.handleclientlist.data.local.entity.*
import kotlin.random.Random

class Client(
    val name: String?,
    var phoneNumber: String?,
    var email: String?,
    var address: Address?,
    var animal: MutableList<Animal> = mutableListOf(),
    var veterinary: Person?,
    var emergencyContact: Person?,
    var informations: Informations?,
    val id: String? = name + Random.nextInt()
)

fun Client.toClientEntity() = ClientEntity(
    id = id,
    name = name,
    phoneNumber = phoneNumber,
    email = email,
    address = address?.toAddressEntity(),
    veterinary = veterinary?.toPersonEntity(),
    emergencyContact = emergencyContact?.toPersonEntity(),
    informations = informations?.toInformationsEntity()

)

data class Address(
    var street: String?,
    var zipCode: String?,
    var city: String?
)

fun Address.toAddressEntity() = AddressEmbedded(
    street = street,
    zipCode = zipCode,
    city = city
)


data class Person(
    var name: String?,
    var phoneNumber: String?
)

private fun Person.toPersonEntity() = PersonEmbedded(
    name = name,
    phoneNumber = phoneNumber
)

data class Informations(
    var petRide: Boolean?,
    var forbiddenRoom: String?,
    var food: String?,
    var drink: String?,
    var frequency: String?,
    var hoursVisits: String?
)

private fun Informations.toInformationsEntity() = InformationsEmbedded(
    petRide = petRide,
    forbiddenRoom = forbiddenRoom,
    food = food,
    drink = drink,
    frequency = frequency,
    hoursVisits = hoursVisits
)