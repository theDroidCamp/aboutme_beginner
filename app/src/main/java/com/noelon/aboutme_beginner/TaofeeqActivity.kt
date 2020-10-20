package com.noelon.aboutme_beginner

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_taofeeq.*

class TaofeeqActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taofeeq)

        next_button.setOnClickListener {
            showToast("Next button clicked")


//            val intent = Intent(this, NextActivity::class.java)
//            startActivity(intent)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}