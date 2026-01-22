package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class sad_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var bottomNavigation: BottomNavigationView

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sad_screen)

        bottomNavigation = findViewById(R.id.bottomNavigation)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> startActivity(Intent(this, home::class.java)) // already on Home, do nothing
                R.id.nav_dashboard -> startActivity(Intent(this, dashboard::class.java))
                R.id.nav_profile -> startActivity(Intent(this, profile::class.java))
            }
            true
        }
    }

}