package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var backArrow : ImageView
        lateinit var editProfileImage : ImageView

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        backArrow = findViewById(/* id = */ R.id.backArrow)
        backArrow.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        editProfileImage = findViewById(/* id = */ R.id.editProfileImage)
        editProfileImage.setOnClickListener {
            val intent = Intent(this, edit_profile::class.java)
            startActivity(intent)
        }
    }
}