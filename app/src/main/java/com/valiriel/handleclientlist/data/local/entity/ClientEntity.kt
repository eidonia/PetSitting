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
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String?,
    val phoneNumber: String?,
    val email: String?,
    @Embedded val address: AddressEmbedded?,
    val animal: List<Long>?,
    @Embedded val veterinary: PersonEmbedded?,
    @Embedded val emergencyContact: PersonEmbedded?,
    @Embedded val informations: InformationsEmbedded?
)

fun ClientEntity.toClient() = Client(
    id = id,
    name = name,
    phoneNumber = phoneNumber,
    email = email,
    address = address?.toAddress(),
    veterinary = veterinary?.toPerson(),
    emergencyContact = emergencyContact?.toPerson(),
    informationsEntity = informations?.toInformations()
)

data class AddressEmbedded(
    val street: String?,
    val zipCode: String?,
    val city: String?
)

fun AddressEmbedded.toAddress() = Address(
    street = street,
    zipCode = zipCode,
    city = city
)

data class PersonEmbedded(
    val name: String?,
    val phoneNumber: String?
)

fun PersonEmbedded.toPerson() = Person(
    name = name,
    phoneNumber = phoneNumber
)

data class InformationsEmbedded(
    val petRide: Boolean?,
    val forbiddenRoom: String?,
    val food: String?,
    val drink: String?,
    val frequency: String?,
    val hoursVisits: String?
)

fun InformationsEmbedded.toInformations() = Informations(
    petRide = petRide,
    forbiddenRoom = forbiddenRoom,
    food = food,
    drink = drink,
    frequency = frequency,
    hoursVisits = hoursVisits
)

