package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sign_in_or_sign_up : AppCompatActivity() {
    lateinit var btnSignUp: Button
    lateinit var btnLogIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in_or_sign_up)

        btnSignUp = findViewById(/* id = */ R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            val intent = Intent(this, sign_up::class.java)
            startActivity(intent)
        }

        btnLogIn = findViewById(/* id = */ R.id.btnLogIn)
        btnLogIn.setOnClickListener {
            val intent = Intent(this, log_in::class.java)
            startActivity(intent)
        }
    }
}