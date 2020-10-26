package com.noelon.aboutme_beginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.noelon.aboutme_beginner.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.droidcampButton.setOnClickListener {
            showToast("Droidcamp button clicked")
            //Todo: Replace "SomeActivity::class with your activity name then remove the comment
           // val intent = Intent( this, AboutCarlaActivity::class.java)
            //startActivity(intent)

          // val intent = Intent(this, AboutEmu::class.java)
            //val intent = Intent(this, About_Stephen::class.java)
           // startActivity(intent)

             //val intent:Intent = Intent(this, AboutOscar::class.java)
           // startActivity(intent)

        }
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}