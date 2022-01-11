package com.valiriel.handleclientlist.domain.model

import com.valiriel.handleclientlist.data.local.entity.AnimalEntity
import com.valiriel.handleclientlist.data.local.entity.TreatmentEmbedded
import kotlin.random.Random


data class Animal(
    val owner: String?,
    val name: String?,
    var age: Int?,
    var treatment: Treatment?,
    val id: String = name + owner + Random.nextInt(0,1000)
)

fun Animal.toAnimalEntity() = AnimalEntity(
    id = id,
    owner = owner,
    name = name,
    age = age,
    treatment = treatment?.toTreatmentEmbedded()
)

data class Treatment(
    var name: String?,
    var instructions: String?
)

fun Treatment.toTreatmentEmbedded() = TreatmentEmbedded(
    name = name,
    instructions = instructions
)



