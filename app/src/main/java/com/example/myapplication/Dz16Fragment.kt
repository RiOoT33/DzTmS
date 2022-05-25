package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentButtonsOnDzBinding
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
        return binding.root
    }
    @SuppressLint("SetTextI18n")
    override fun onStart() {
        super.onStart()
        binding.buttonStarTask16.setOnClickListener{
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
        binding.buttonNextTask.setOnClickListener{
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container,Dz16Task2Fragment())
                ?.addToBackStack("Name")
                ?.commit()
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}