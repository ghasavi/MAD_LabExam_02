package com.example.moodlift

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class dashboard : AppCompatActivity() {

    lateinit var c1 : CardView
    lateinit var c2 : CardView
    lateinit var c3 : CardView
    lateinit var c4 : CardView
    lateinit var c5 : CardView
    lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)

        c1 = findViewById(/* id = */ R.id.c1)
        c1.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        c2 = findViewById(/* id = */ R.id.c2)
        c2.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        c3 = findViewById(/* id = */ R.id.c3)
        c3.setOnClickListener {
            val intent = Intent(this, angry_screen::class.java)
            startActivity(intent)
        }
        c4 = findViewById(/* id = */ R.id.c4)
        c4.setOnClickListener {
            val intent = Intent(this, sad_screen::class.java)
            startActivity(intent)
        }
        c5 = findViewById(/* id = */ R.id.c5)
        c5.setOnClickListener {
            val intent = Intent(this, anxious_screen::class.java)
            startActivity(intent)
        }

        bottomNavigation = findViewById(R.id.bottomNavigation)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> startActivity(Intent(this, home::class.java))
                R.id.nav_dashboard -> {} // already on Dashboard, do nothing
                R.id.nav_profile -> startActivity(Intent(this, profile::class.java))
            }
            true
        }
    }
}