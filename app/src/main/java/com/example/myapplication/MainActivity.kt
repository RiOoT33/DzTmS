package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragm = Dz17_newFragment.newInstance()
        supportFragmentManager.beginTransaction().replace(R.id.mainFrameLayout, fragm).commit()
    }
}