package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {

        val answers: Array<String> = arrayOf(
                "Да",
                "Нет",
                "Скорее всего нет",
                "Скорее всего да",
                "Возможно",
                "Имеются преспективы",
                "Вопрос задан неверно")

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            var scan = Scanner(System.`in`)
            val question = scan.nextLine()
            if (  question == " " ) {
                println("Введите вопрос ещё раз ")
            }
            println(answers.random())

        }
    }





