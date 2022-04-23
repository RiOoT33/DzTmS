package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a: Int
        var c = 0
        val scn = Scanner(System.`in`)
        if (scn.hasNextInt()) {
            a = scn.nextInt()
            while (a != 0) {
                c += a % 10
                a /= 10
            }
            println("The sum is $c")
        } else println("Error. Try again")
    }
}


