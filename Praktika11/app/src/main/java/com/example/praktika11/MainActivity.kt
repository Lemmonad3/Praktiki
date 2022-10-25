package com.example.praktika11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn(view: View) {
        val photo:ImageView = findViewById(R.id.imageView2)
        val image: Int = R.drawable.pear
        val description: String = "This is the logo"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
}