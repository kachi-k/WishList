package com.kachi.wishlist.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
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

        val fab: FloatingActionButton = findViewById(R.id.fab_wishlist)
        fab.setOnClickListener{
            val intent: Intent = Intent(this,AddNewWish::class.java)
            startActivity(intent)
        }

    }
}