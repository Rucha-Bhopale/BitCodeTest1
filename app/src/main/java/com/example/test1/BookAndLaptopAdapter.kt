package com.example.test1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAndLaptopAdapter (private val itemList: List<String>) :
    RecyclerView.Adapter<BookAndLaptopAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_and_laptop_adaptor, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.textView.text = item


        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(
                holder.itemView.resources.getColor(R.color.bookColor)
            )
        } else {
            holder.itemView.setBackgroundColor(
                holder.itemView.resources.getColor(R.color.laptopColor)
            )
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}