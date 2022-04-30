package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        max(1, 2, 3)
    }

    private fun max(a: Int, b: Int, c: Int) {
        val plus = a + b + c
        val multiplay = a * b * c
        when {
            plus == multiplay -> Log.i("Value","Значения равны")
            plus > multiplay -> Log.i("Value","$plus > $multiplay")
            plus < multiplay -> Log.i("Value","$plus < $multiplay")

        }
    }
}


