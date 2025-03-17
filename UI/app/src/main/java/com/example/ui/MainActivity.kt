package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReady = findViewById<Button>(R.id.btnReady)
        btnReady.setOnClickListener {
            val intent = Intent(this, UIComponentsActivity::class.java)
            startActivity(intent)
        }
    }
}
