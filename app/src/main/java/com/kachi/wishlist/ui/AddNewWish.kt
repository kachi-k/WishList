package com.kachi.wishlist.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.kachi.wishlist.R
import kotlinx.android.synthetic.main.item_wish.*

class AddNewWish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_wish)


        val saveBtn: Button = findViewById(R.id.save_button)
        saveBtn.setOnClickListener{

            val intent: Intent = Intent(this, MainActivity::class.java)

            intent.putExtra("wish", title)

        }
    }
}

