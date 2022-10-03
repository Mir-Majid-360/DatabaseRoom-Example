package com.example.roomexample

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "passwords")
data class Password(
    @PrimaryKey( autoGenerate = true)
    val id: Long,
    val name : String,
    val password : String
)
