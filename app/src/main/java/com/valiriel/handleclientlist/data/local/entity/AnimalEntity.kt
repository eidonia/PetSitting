package com.valiriel.handleclientlist.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.valiriel.handleclientlist.domain.model.Animal
import com.valiriel.handleclientlist.domain.model.Treatment

@Entity
data class AnimalEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String?,
    val age: Int?,
    val treatment: TreatmentEmbedded?
)

fun AnimalEntity.toAnimal() = Animal(
    id = id,
    name = name,
    age = age,
    treatment = treatment?.toTreatment()
)

data class TreatmentEmbedded(
    @PrimaryKey(autoGenerate = true)
    val name: String?,
    val instructions: String?
)

fun TreatmentEmbedded.toTreatment() = Treatment(
    name = name,
    instructions = instructions
)