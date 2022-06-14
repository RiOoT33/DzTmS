package com.example.myapplication.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.data.Cat

class ViewHolder(view : View):RecyclerView.ViewHolder(view) {
    val name : TextView = view.findViewById(R.id.tv_name)
    val age : TextView = view.findViewById(R.id.tv_age)
    val imageView : ImageView = view.findViewById(R.id.catsPhotos)
    fun bind(cat: Cat) {
        name.text = cat.name
        age.text = cat.age.toString()
       Glide.with(itemView.context)
           .load(cat.url)
           .centerCrop()
           .placeholder(R.drawable.ic_launcher_background)
           .into(imageView)
        itemView.setOnClickListener{
        }
    }
}
