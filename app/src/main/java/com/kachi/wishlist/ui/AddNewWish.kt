package com.kachi.wishlist.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kachi.wishlist.R
import com.kachi.wishlist.model.Wish

class AddNewWish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_wish)

        val saveBtn: Button = findViewById(R.id.save_button)
        val titleField = findViewById<EditText>(R.id.title_field)
        val dateField = findViewById<EditText>(R.id.date_field)

        saveBtn.setOnClickListener {
            // get the user input
            val title = titleField.text.toString()
            val date = dateField.text.toString()

            if (title.isEmpty()) {
                Toast.makeText(this, "Title required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (date.isEmpty()) {
                Toast.makeText(this, "Date required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }



            // Create a new wish from the user input
            val wish = Wish(title, date)

            // create an intent to return the data
            val resultIntent = Intent()

            resultIntent.putExtra("newWish", wish)

            setResult(RESULT_OK, resultIntent)

            finish()
        }
    }

}

