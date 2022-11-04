package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var z1 = false
        var z2 = false
        var z3 = false
        var z4 = false
        var z5 = false
        findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest bagieta",Toast.LENGTH_SHORT).show()
            if (z1 === false)
            {
                findViewById<ImageButton>(R.id.imageButton).alpha = 0.5F
                 z1 = true
            }
            else
            {
                findViewById<ImageButton>(R.id.imageButton).alpha = 1F
                 z1 = false
            }
        }
        findViewById<ImageButton>(R.id.imageButton2).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest helikopter",Toast.LENGTH_SHORT).show()
            if (z2 === false)
            {
                findViewById<ImageButton>(R.id.imageButton2).alpha = 0.5F
                z2 = true
            }
            else
            {
                findViewById<ImageButton>(R.id.imageButton2).alpha = 1F
                z2 = false
            }
        }
        findViewById<ImageButton>(R.id.imageButton3).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest Jan Pawel II",Toast.LENGTH_SHORT).show()
            if (z3 === false)
            {
                findViewById<ImageButton>(R.id.imageButton3).alpha = 0.5F
                z3 = true
            }
            else
            {
                findViewById<ImageButton>(R.id.imageButton3).alpha = 1F
                z3 = false
            }
        }
        findViewById<ImageButton>(R.id.imageButton4).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest pudliszki",Toast.LENGTH_SHORT).show()
            if (z4 === false)
            {
                findViewById<ImageButton>(R.id.imageButton4).alpha = 0.5F
                z4 = true
            }
            else
            {
                findViewById<ImageButton>(R.id.imageButton4).alpha = 1F
                z4 = false
            }
        }
        findViewById<ImageButton>(R.id.imageButton5).setOnClickListener {
            Toast.makeText(this@MainActivity,"To jest żul",Toast.LENGTH_SHORT).show()
            if (z5 === false)
            {
                findViewById<ImageButton>(R.id.imageButton5).alpha = 0.5F
                z5 = true
            }
            else
            {
                findViewById<ImageButton>(R.id.imageButton5).alpha = 1F
                z5 = false
            }
        }

    }
}