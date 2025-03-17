package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UIComponentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_components)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnTextDetail = findViewById<Button>(R.id.btnTextDetail)

        btnBack.setOnClickListener { finish() } // Quay lại MainActivity
        btnTextDetail.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}
