package com.valiriel.handleclientlist.common

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class Converters {
    private var gson = Gson()

    @TypeConverter
    fun stringToListLong(data: String?): MutableList<Long?> {
        if (data == null) {
            return mutableListOf()
        }
        val listType: Type = object : TypeToken<List<Long?>?>(){}.type
        return gson.fromJson<MutableList<Long?>>(data, listType)
    }

    @TypeConverter
    fun listLongToString(someObject: List<Long?>?): String {
        return gson.toJson(someObject)
    }
}