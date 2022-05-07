package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.coroutines.*
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.ButtonStart.setOnClickListener {

        }
        GlobalScope.launch(Dispatchers.MAIN){  }
    }

    fun startFarm (){
            var Farm1 = 0
            var Farm2 = 0
            var Farm3 = 0
            bindingClass.Bar1.max = 100
            bindingClass.Bar2.max = 100
            bindingClass.Bar3.max = 100
    }

}


