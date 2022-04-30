package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit   var bindingClass : ActivityMainBinding
    private val TAG = "Info"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.buttonValue.setOnClickListener {

            val resultA =  bindingClass.inputA.text.toString().toInt()
            Log.i(TAG,   "Ввели число  A = $resultA")
            val resultB = bindingClass.inputB.text.toString().toInt()
            Log.i(TAG,   "Ввели число  B = $resultB")
            val  multiplication = resultA * resultB
            val summa = resultA + resultB
            when(resultA % 2 == 0){
                true ->
                    bindingClass.result.text = "Результат = $multiplication"
              false -> bindingClass.result.text = "Результат = $summa"
            }
        }
    }
}


