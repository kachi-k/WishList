package com.kachi.wishlist.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kachi.wishlist.R
import com.kachi.wishlist.adapters.WishAdapter
import com.kachi.wishlist.demo.DummyData
import com.kachi.wishlist.model.Wish

const val NEW_WISH_REQUEST_CODE = 0

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.wish_list_recycler_view)


        val adapter = WishAdapter(DummyData.getListOfWishes())

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = adapter

        val fab: FloatingActionButton = findViewById(R.id.fab_wishlist)
        fab.setOnClickListener {
            val intent = Intent(this, AddNewWish::class.java)
            startActivityForResult(intent, NEW_WISH_REQUEST_CODE)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == NEW_WISH_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                val wish = data?.getParcelableExtra<Wish>("newWish")
                Toast.makeText(this, wish.toString(), Toast.LENGTH_LONG).show()
            }
        }
    }
}