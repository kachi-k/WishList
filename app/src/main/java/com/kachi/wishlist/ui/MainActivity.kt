package com.kachi.wishlist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kachi.wishlist.R
import com.kachi.wishlist.adapters.WishAdapter
import com.kachi.wishlist.demo.DummyData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.wish_list_recycler_view)


        val adapter = WishAdapter(DummyData.getListOfWishes())

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = adapter


    }
}