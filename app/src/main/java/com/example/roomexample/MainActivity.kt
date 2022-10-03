package com.example.roomexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: PasswordDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(applicationContext,
            PasswordDatabase::class.java,
            "passwordsDb").build()

        GlobalScope.launch {

            database.passwordDao().insertPassword(Password(0,"Google","Google#@123"))

        }

    }
}