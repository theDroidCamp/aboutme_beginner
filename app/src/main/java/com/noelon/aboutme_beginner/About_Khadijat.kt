package com.noelon.aboutme_beginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about__khadijat.*
import kotlinx.android.synthetic.main.activity_main.*

class About_Khadijat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about__khadijat)

        khay_button.setOnClickListener {
            showToast("You are leaving Khadijat page")
         //   Todo: Replace "NewActivity::class with your activity name then remove the comment
//            val intent = Intent(this, NewActivity::class.java)
//            startActivity(intent)
        }
    }


    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}