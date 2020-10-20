package com.noelon.aboutme_beginner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        droidcamp_button.setOnClickListener {



            val intent = Intent(this, TaofeeqActivity::class.java)
            startActivity(intent)
        }
    }

}
