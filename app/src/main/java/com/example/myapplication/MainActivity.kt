package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val randomValue = (5..155).random()
        println(randomValue)
        val interval = 25..100

        if (interval.contains(randomValue)) {
            println("Contains")
        } else {
            println("Doesn't contains")
        }
    }
}


