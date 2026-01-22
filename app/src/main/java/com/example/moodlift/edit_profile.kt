package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class edit_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var backArrow : ImageView
        lateinit var btnSave : Button


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)

        backArrow = findViewById(/* id = */ R.id.backArrow)
        backArrow.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        btnSave = findViewById(/* id = */ R.id.btnSave)
        btnSave.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
    }
}