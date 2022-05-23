package com.example.ebaykotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebaykotlin.R
import com.example.ebaykotlin.model.GridModel


/**
 * Created by Eldor Turgunov on 23.05.2022.
 * ebay Kotlin
 * eldorturgunov777@gmail.com
 */
class VerticalAdapter(var context: Context, var list: List<GridModel>) :
    RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VerticalAdapter.VerticalViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_vertical, parent, false)
        return VerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: VerticalAdapter.VerticalViewHolder, position: Int) {
        val data = list[position]
        holder.imageView.setImageResource(data.img)
        holder.title.text = data.title
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class VerticalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var title: TextView

        init {
            imageView = itemView.findViewById(R.id.img_grid)
            title = itemView.findViewById(R.id.tv_grid)
        }
    }
}