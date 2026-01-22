package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class get_started : AppCompatActivity() {
    lateinit var btnGetStarted : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_get_started)


        btnGetStarted = findViewById(/* id = */ R.id.btnGetStarted)
        btnGetStarted.setOnClickListener {
            val intent = Intent(this, sign_in_or_sign_up::class.java)
            startActivity(intent)
        }
    }
}