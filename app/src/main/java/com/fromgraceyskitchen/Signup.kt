package com.fromgraceyskitchen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        btnRegister.setOnClickListener{
            val intent = Intent(this, AdminPlatform::class.java)
            startActivity(intent)
        }
    }
}