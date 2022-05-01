package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit   var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.buttonClick.setOnClickListener {
            val student =  bindingClass.studentGrade.text.toString().toInt()
                Log.i("student","Оценка = $student")
            when(student){
                in 0..19 -> {bindingClass.result.visibility = View.VISIBLE
                             bindingClass.result.text = "Ваша оценка F"}
                in 20..39 ->{bindingClass.result.visibility = View.VISIBLE
                             bindingClass.result.text = "Ваша оценка E"}
                in 40..59 ->{bindingClass.result.visibility = View.VISIBLE
                             bindingClass.result.text = "Ваша оценка D"}
                in 60..74 ->{bindingClass.result.visibility = View.VISIBLE
                             bindingClass.result.text = "Ваша оценка C"}
                in 75..89 ->{bindingClass.result.visibility = View.VISIBLE
                             bindingClass.result.text = "Ваша оценка B"}
                in 90..100 ->{bindingClass.result.visibility = View.VISIBLE
                              bindingClass.result.text = "Ваша оценка A"}
                else -> {bindingClass.result.visibility = View.VISIBLE
                         bindingClass.result.text = "Такой оценки нет"}
            }
        }
    }
}



