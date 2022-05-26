package com.example.myapplication

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplication.databinding.FragmentDz17NewBinding

class Dz17_newFragment : Fragment() {
    private var _binding: FragmentDz17NewBinding? = null
    private val binding get() = _binding!!
    private var timer: CountDownTimer? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDz17NewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.btnBegin.setOnClickListener {
            val textEditor: TextView = binding.secondsReceiver
            startTimer(textEditor.text.toString().toInt())
        }
    }

    fun startTimer(seconds: Int) {
        timer?.cancel()
        val textEditor: TextView = binding.secondsReceiver
        timer = object : CountDownTimer(seconds.toLong() * 1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                textEditor.setText((millisUntilFinished / 1000).toString())
            }

            override fun onFinish() {
                textEditor.text = "Финишь"
            }
        }.start()
    }
}
