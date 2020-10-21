package com.noelon.aboutme_beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about__dianah.*


class About_Dianah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about__dianah)

        next_button.setOnClickListener {
            showToast("Wanna see next human's screen")
            //Todo: Replace "About_Dianah::class with your activity name then remove the comment
//            val intent = Intent(this, SomeActivity::class.java)
//            startActivity(intent)
        }
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}