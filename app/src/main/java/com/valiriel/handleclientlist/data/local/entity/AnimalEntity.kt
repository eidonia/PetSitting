package com.valiriel.handleclientlist.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.valiriel.handleclientlist.domain.model.Animal
import com.valiriel.handleclientlist.domain.model.Treatment

@Entity
data class AnimalEntity(
    @PrimaryKey(autoGenerate = false)
    val  id: String,
    val owner: String?,
    val name: String?,
    var age: Int?,
    var treatment: TreatmentEmbedded?
)

fun AnimalEntity.toAnimal() = Animal(
    id = id,
    owner = owner,
    name = name,
    age = age,
    treatment = treatment?.toTreatment()
)

data class TreatmentEmbedded(
    var name: String?,
    var instructions: String?
)

fun TreatmentEmbedded.toTreatment() = Treatment(
    name = name,
    instructions = instructions
)