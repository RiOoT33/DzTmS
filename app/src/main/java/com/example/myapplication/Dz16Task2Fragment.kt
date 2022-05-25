package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentDz16Task2Binding

class Dz16Task2Fragment : Fragment() {
    private var _binding: FragmentDz16Task2Binding? = null
    private val binding get () = _binding!!
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDz16Task2Binding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onStart(){
        super.onStart()
        binding.buttonStartTask2.setOnClickListener{
            val student =  binding.studentGrade.text.toString().toInt()
            Log.i("student","Оценка = $student")
            when(student){
                in 0..19 -> {binding.result.visibility = View.VISIBLE
                    binding.result.text = "Ваша оценка F"}
                in 20..39 ->{binding.result.visibility = View.VISIBLE
                    binding.result.text = "Ваша оценка E"}
                in 40..59 ->{binding.result.visibility = View.VISIBLE
                    binding.result.text = "Ваша оценка D"}
                in 60..74 ->{binding.result.visibility = View.VISIBLE
                    binding.result.text = "Ваша оценка C"}
                in 75..89 ->{binding.result.visibility = View.VISIBLE
                    binding.result.text = "Ваша оценка B"}
                in 90..100 ->{binding.result.visibility = View.VISIBLE
                    binding.result.text = "Ваша оценка A"}
                else -> {binding.result.visibility = View.VISIBLE
                    binding.result.text = "Такой оценки нет"}
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}