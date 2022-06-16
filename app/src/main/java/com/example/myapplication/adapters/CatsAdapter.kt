package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.FragmentCats
import com.example.myapplication.R
import com.example.myapplication.data.Cat
import com.example.myapplication.databinding.ItemCatBinding

class CatsAdapter( val cats: List<Cat>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding : ItemCatBinding = ItemCatBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cats[position])
    }

    override fun getItemCount(): Int = cats.size


}
