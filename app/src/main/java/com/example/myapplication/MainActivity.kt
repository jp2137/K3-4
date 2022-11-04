package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest bagieta",Toast.LENGTH_SHORT).show()
        }
        findViewById<ImageButton>(R.id.imageButton2).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest helikopter",Toast.LENGTH_SHORT).show()
        }
        findViewById<ImageButton>(R.id.imageButton3).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest Jan Paswel II",Toast.LENGTH_SHORT).show()
        }
        findViewById<ImageButton>(R.id.imageButton4).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest pudliszki",Toast.LENGTH_SHORT).show()
        }
        findViewById<ImageButton>(R.id.imageButton5).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest żul",Toast.LENGTH_SHORT).show()
        }

    }
}