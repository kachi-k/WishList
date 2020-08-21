package com.kachi.wishlist.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kachi.wishlist.R
import com.kachi.wishlist.model.Wish
import kotlinx.android.synthetic.main.item_wish.view.*
import org.w3c.dom.Text

/**
 *   Created by OLABODE WILSON on 8/20/20.
 */

// Create your WishAdapter , which is a recyclerview adapter here
class WishAdapter(private val wishlist: List<Wish>) : RecyclerView.Adapter<WishAdapter.WishViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_main,
        parent, false)
        return WishViewHolder(itemView)
    }

    override fun getItemCount() = wishlist.size

    override fun onBindViewHolder(holder: WishViewHolder, position: Int) {
        val currentItem = wishlist[position]

        holder.textView.text = currentItem.title
        holder.textView2.text = currentItem.date
    }

    class WishViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.wish_title
        val textView2 : TextView = itemView.wish_date
    }
}