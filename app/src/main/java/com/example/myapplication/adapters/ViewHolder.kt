package com.example.myapplication.adapters

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.data.Cat
import com.example.myapplication.databinding.ItemCatBinding

class ViewHolder(binding:ItemCatBinding):RecyclerView.ViewHolder(binding.root) {
    val name : TextView = binding.tvName
    val age : TextView = binding.tvAge
    val imageView : ImageView = binding.catsPhotos
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
