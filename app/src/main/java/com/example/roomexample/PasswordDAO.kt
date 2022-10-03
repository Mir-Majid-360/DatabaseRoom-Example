package com.example.roomexample

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PasswordDAO {

    @Insert
    suspend fun insertPassword(password: Password)

    @Update
    suspend fun  updatePassword(password: Password)

    @Delete
    suspend fun deletePassword(password: Password)

    @Query("SELECT * FROM passwords")
    fun getPassword(): LiveData<List<Password>>
}