package com.example.ebaykotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebaykotlin.R
import com.example.ebaykotlin.model.ListData


/**
 * Created by Eldor Turgunov on 23.05.2022.
 * ebay Kotlin
 * eldorturgunov777@gmail.com
 */
class HorizontalAdapter(var context: Context, var list: List<ListData>) :
    RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HorizontalAdapter.HorizontalViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_horizontal, parent, false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalAdapter.HorizontalViewHolder, position: Int) {
        val data = list[position]
        holder.img_horizontal.setImageResource(data.img)
        holder.title_horizontal.text = data.title
        holder.price.text = data.price
        holder.discount.text = data.discount
        holder.percent.text = data.percent

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class HorizontalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img_horizontal: ImageView
        var title_horizontal: TextView
        var price: TextView
        var discount: TextView
        var percent: TextView

        init {
            img_horizontal = itemView.findViewById<ImageView>(R.id.img_horizontal)
            title_horizontal = itemView.findViewById<TextView>(R.id.title_horizontal)
            price = itemView.findViewById(R.id.price)
            discount = itemView.findViewById(R.id.discount)
            percent = itemView.findViewById(R.id.percent)
        }
    }
}