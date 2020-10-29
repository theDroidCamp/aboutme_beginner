package com.noelon.aboutme_beginner;

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class About_nadia: AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_nadia)

        val image:ImageView = findViewById(R.id.imageView_nadia)
        val textView:TextView = findViewById(R.id.textView_about_nadia)
        val button:Button = findViewById(R.id.button_nadia)

        button.setOnClickListener( View.OnClickListener {
            val intent: Intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }

    }

