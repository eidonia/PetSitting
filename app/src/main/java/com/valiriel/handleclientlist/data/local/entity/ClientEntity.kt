package com.valiriel.handleclientlist.data.local.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.valiriel.handleclientlist.domain.model.Address
import com.valiriel.handleclientlist.domain.model.Client
import com.valiriel.handleclientlist.domain.model.Informations
import com.valiriel.handleclientlist.domain.model.Person

@Entity
data class ClientEntity(
    @PrimaryKey(autoGenerate = false) val id: String?,
    val name: String?,
    var phoneNumber: String?,
    var email: String?,
    @Embedded val address: AddressEmbedded?,
    var animal: List<String>? = mutableListOf(),
    @Embedded var veterinary: PersonEmbedded?,
    @Embedded var emergencyContact: PersonEmbedded?,
    @Embedded var informations: InformationsEmbedded?
)

fun ClientEntity.toClient() = Client(
    id = id,
    name = name,
    phoneNumber = phoneNumber,
    email = email,
    address = address?.toAddress(),
    veterinary = veterinary?.toPerson(),
    emergencyContact = emergencyContact?.toPerson(),
    informations = informations?.toInformations()
)

data class AddressEmbedded(
    var street: String?,
    var zipCode: String?,
    var city: String?
)

fun AddressEmbedded.toAddress() = Address(
    street = street,
    zipCode = zipCode,
    city = city
)

data class PersonEmbedded(
    var name: String?,
    var phoneNumber: String?
)

fun PersonEmbedded.toPerson() = Person(
    name = name,
    phoneNumber = phoneNumber
)

data class InformationsEmbedded(
    var petRide: Boolean?,
    var forbiddenRoom: String?,
    var food: String?,
    var drink: String?,
    var frequency: String?,
    var hoursVisits: String?
)

fun InformationsEmbedded.toInformations() = Informations(
    petRide = petRide,
    forbiddenRoom = forbiddenRoom,
    food = food,
    drink = drink,
    frequency = frequency,
    hoursVisits = hoursVisits
)

