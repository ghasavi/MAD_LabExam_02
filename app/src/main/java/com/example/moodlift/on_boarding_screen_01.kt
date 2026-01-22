package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class on_boarding_screen_01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btnnext : Button

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_boarding_screen01)

        btnnext = findViewById(/* id = */ R.id.btnnext)
        btnnext.setOnClickListener {
            val intent = Intent(this, on_boarding_screen_02::class.java)
            startActivity(intent)
        }
    }
}