package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var cardSad : CardView
        lateinit var cardAngry : CardView
        lateinit var cardAnxious : CardView
        lateinit var bottomNavigation: BottomNavigationView


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        cardSad = findViewById(/* id = */ R.id.cardSad)
        cardSad.setOnClickListener {
            val intent = Intent(this, sad_screen::class.java)
            startActivity(intent)
        }

        cardAngry = findViewById(/* id = */ R.id.cardAngry)
        cardAngry.setOnClickListener {
            val intent = Intent(this, angry_screen::class.java)
            startActivity(intent)
        }

        cardAnxious = findViewById(/* id = */ R.id.cardAnxious)
        cardAnxious.setOnClickListener {
            val intent = Intent(this, anxious_screen::class.java)
            startActivity(intent)
        }

        bottomNavigation = findViewById(R.id.bottomNavigation)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {} // already on Home, do nothing
                R.id.nav_dashboard -> startActivity(Intent(this, dashboard::class.java))
                R.id.nav_profile -> startActivity(Intent(this, profile::class.java))
            }
            true
        }

    }
}