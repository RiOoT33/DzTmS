package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentButtonsOnDzBinding


class ButtonsOnDzFragment : Fragment() {

    private var _binding: FragmentButtonsOnDzBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentButtonsOnDzBinding.inflate(inflater, container, false)
        binding.dz16.setOnClickListener{
          this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container,Dz16Fragment())
                ?.addToBackStack("Name")
                ?.commit()
        }
        val view = binding.root
        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
