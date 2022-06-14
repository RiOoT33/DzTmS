package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.CatsAdapter
import com.example.myapplication.data.Cat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val list = findViewById<RecyclerView>(R.id.Cats_list)
        list.adapter = CatsAdapter(this,    getCats())
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
}