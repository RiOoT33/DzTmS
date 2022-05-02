package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var timer: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btnBegin)
        button.setOnClickListener {
            val textEditor: TextView = findViewById(R.id.secondsReceiver)
            startTimer(textEditor.text.toString().toInt())
        }
    }

    fun startTimer (seconds: Int) {
        timer?.cancel()
        val textEditor: TextView = findViewById(R.id.secondsReceiver)
        timer = object: CountDownTimer(seconds.toLong()*1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                textEditor.text = (millisUntilFinished/1000).toString()
            }

            override fun onFinish() {
                textEditor.text = "Финишь"
            }

        }.start()
    }
}
