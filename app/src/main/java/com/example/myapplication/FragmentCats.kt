package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapters.CatsAdapter
import com.example.myapplication.data.Cat
import com.example.myapplication.databinding.FragmentCatsBinding


class FragmentCats : Fragment() {
    private var _binding: FragmentCatsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCatsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    val adapter = CatsAdapter(getCats())
        binding.catsList.adapter = adapter
        binding.catsList.layoutManager = LinearLayoutManager(context)
    }
        private fun getCats(): List<Cat>{
    return listOf(
        Cat("Кузя",2,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTfdhpvnEolpqSMfFuHcMEQiWxmBelrXPQNA&usqp=CAU"),
        Cat("Барсик",3,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnzo0zD6WW0KETCFSlmbeKVFKAQAHbujAaoA&usqp=CAU"),
        Cat("Пузик",4,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxmNJnSD1EzUKVE14OgHT3EZEQlB19Unkldw&usqp=CAU"),
        Cat("Сява",5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQ7QdDyhszLKIh4gIhNQc-hpnVV5x2sdYqqw&usqp=CAU"),
        Cat("Лепс",6,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRj3I3u2iO1j4EeXsDgrVmeq2O0jHKfTJoiAg&usqp=CAU"),
        Cat("Мурзик",1,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuKkclZZ3caJqDVZXqnFuZdw5wYBDO8VWQUA&usqp=CAU"),
    )
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

