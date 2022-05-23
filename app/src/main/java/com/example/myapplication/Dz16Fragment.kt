package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.FragmentDz16Binding

class Dz16Fragment : Fragment() {
    private var _binding: FragmentDz16Binding? = null
    private val binding get() = _binding!!
    private val TAG = "Info"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDz16Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
    override fun onStart() {
        super.onStart()
        binding.buttonValue.setOnClickListener{
            val resultA = binding.inputA.text.toString().toInt()
            Log.i(TAG,   "Ввели число  A = $resultA")
            val resultB = binding.inputB.text.toString().toInt()
            Log.i(TAG,   "Ввели число  B = $resultB")
            val  multiplication = resultA * resultB
            val summa = resultA + resultB
            when(resultA % 2 == 0){
                true ->
                   binding.result.text = "Результат = $multiplication"
              false -> binding.result.text = "Результат = $summa"
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}