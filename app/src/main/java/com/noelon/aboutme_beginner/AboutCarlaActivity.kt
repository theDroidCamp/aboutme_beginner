package com.noelon.aboutme_beginner

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.noelon.aboutme_beginner.databinding.ActivityAboutCarlaBinding

class AboutCarlaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutCarlaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutCarlaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.githubButton.setOnClickListener {
            val gitUrl = Uri.parse("https://github.com/carluvy")
            try {
                val intent = Intent(Intent.ACTION_VIEW, gitUrl)
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {


            }


        }
    }
}