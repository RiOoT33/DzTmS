package com.example.myapplication.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.Cat

class ViewHolder(view : View):RecyclerView.ViewHolder(view) {
    val name : TextView = view.findViewById(R.id.tv_name)
    val age : TextView = view.findViewById(R.id.tv_age)
    fun bind(cat: Cat) {
        name.text = cat.name
        age.text = cat.age.toString()
        itemView.setOnClickListener{

        }
    }

}
