package com.fromgraceyskitchen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler().postDelayed({
            // Start the main activity or any other activity
            startActivity(Intent(this, Login::class.java))
            finish() // Close the splash screen activity
        }, 2000) // 2 seconds delay
    }
}