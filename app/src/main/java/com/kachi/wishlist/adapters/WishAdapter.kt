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
            R.layout.item_wish,
        parent, false)
        return WishViewHolder(itemView)
    }

    override fun getItemCount() = wishlist.size

    override fun onBindViewHolder(holder: WishViewHolder, position: Int) {
        val currentItem = wishlist[position]

        holder.wishTitle.text = currentItem.title
        holder.wishDate.text = currentItem.date
    }

    class WishViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val wishTitle : TextView = itemView.wish_title
        val wishDate : TextView = itemView.wish_date
    }
}