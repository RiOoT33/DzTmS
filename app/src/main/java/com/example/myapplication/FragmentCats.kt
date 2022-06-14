package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentCats : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val list = findViewById<RecyclerView>(R.id.Cats_list)
//        list.adapter = CatsAdapter(this,    getCats())
        return inflater.inflate(R.layout.fragment_fragmenone, container, false)
    }
//    private fun getCats(): List<Cat>{
//        return listOf(
//            Cat("Barsik",2,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTfdhpvnEolpqSMfFuHcMEQiWxmBelrXPQNA&usqp=CAU"),
//            Cat("Barsik1",3,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnzo0zD6WW0KETCFSlmbeKVFKAQAHbujAaoA&usqp=CAU"),
//            Cat("Barsik2",4,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxmNJnSD1EzUKVE14OgHT3EZEQlB19Unkldw&usqp=CAU"),
//            Cat("Barsik3",5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQ7QdDyhszLKIh4gIhNQc-hpnVV5x2sdYqqw&usqp=CAU"),
//            Cat("Barsik4",6,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRj3I3u2iO1j4EeXsDgrVmeq2O0jHKfTJoiAg&usqp=CAU"),
//            Cat("Barsik5",1,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuKkclZZ3caJqDVZXqnFuZdw5wYBDO8VWQUA&usqp=CAU"),
//        )
    }

