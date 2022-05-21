package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.CatsAdapter
import com.example.myapplication.data.Cat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = findViewById<RecyclerView>(R.id.rv_list)
        list.adapter = CatsAdapter(this,    getCats())
    }

    private fun getCats(): List<Cat>{
    return listOf(
        Cat("Barsik",2),
        Cat("Barsik1",3),
        Cat("Barsik2",4),
        Cat("Barsik3",5),
        Cat("Barsik4",6),
        Cat("Barsik5",1),
    )
    }
}