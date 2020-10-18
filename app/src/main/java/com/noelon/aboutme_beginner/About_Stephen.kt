package com.noelon.aboutme_beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about_stephen.*

class About_Stephen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_stephen)

        button.setOnClickListener {
            showToast("About_Stephen button clicked")
            //Todo: Replace "SomeActivity::class with your activity name then remove the comment
//            val intent = Intent(this, SomeActivity::class.java)
//            startActivity(intent)
        }
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}