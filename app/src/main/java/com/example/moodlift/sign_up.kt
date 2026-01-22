package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var btnSignUp : Button
        lateinit var backArrow : ImageView

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        btnSignUp = findViewById(/* id = */ R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        backArrow = findViewById(/* id = */ R.id.backArrow)
        backArrow.setOnClickListener {
            val intent = Intent(this, sign_in_or_sign_up::class.java)
            startActivity(intent)
        }
    }
}