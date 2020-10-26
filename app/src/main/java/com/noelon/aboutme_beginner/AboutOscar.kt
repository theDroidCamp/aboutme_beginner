package com.noelon.aboutme_beginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AboutOscar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_oscar)
        val image:ImageView = findViewById(R.id.imageView_oscar)
        val about:TextView = findViewById(R.id.textView_about_oscar)
        val button: Button = findViewById(R.id.button_oscar)

        button.setOnClickListener(View.OnClickListener {
            val intent:Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}