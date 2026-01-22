package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class on_boarding_screen_02 : AppCompatActivity() {
    lateinit var btnnext : Button
    lateinit var btnback : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_boarding_screen02)

        btnnext = findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
            val intent = Intent(this, get_started::class.java)
            startActivity(intent)
        }

        btnback = findViewById(R.id.btnback)
        btnback.setOnClickListener {
            val intent = Intent(this, on_boarding_screen_01::class.java)
            startActivity(intent)
        }
    }
}