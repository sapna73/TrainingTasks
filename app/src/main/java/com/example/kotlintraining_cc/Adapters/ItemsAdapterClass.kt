package com.example.kotlintraining_cc.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.kotlintraining_cc.ModelClasses.ItemsModel
import com.example.kotlintraining_cc.R

class ItemsAdapterClass (private val moviesList: List<ItemsModel>) : Adapter<ItemsAdapterClass.MyViewHolder>() {

        inner class MyViewHolder(view: View) : ViewHolder(view) {
            var title: TextView = view.findViewById<TextView>(R.id.title)
            var year: TextView = view.findViewById<TextView>(R.id.year)
            var genre: TextView = view.findViewById<TextView>(R.id.genre)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.items_list_recyclerview, parent, false)

            return MyViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val Movies = moviesList[position]
            holder.title.text = Movies.title
            holder.genre.text = Movies.genre
            holder.year.text = Movies.year
        }

        override fun getItemCount(): Int {
            return moviesList.size
        }
    }