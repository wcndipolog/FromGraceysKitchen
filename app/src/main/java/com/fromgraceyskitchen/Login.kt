package com.fromgraceyskitchen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnSignup = findViewById<Button>(R.id.btnSignup)
        btnSignup.setOnClickListener{
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener{
            val intent = Intent(this, UserPlatform::class.java)
            startActivity(intent)
        }
    }
}