package com.example.buoi_03.buoi_08

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "UserProfile")
data class UserProfile (

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "age")
    val age: Int,

    @ColumnInfo(name = "gender")
    val gender: String,

    @ColumnInfo(name = "high")
    val high: String,

    @ColumnInfo(name = "weight")
    val weight: String
){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long = 0
}