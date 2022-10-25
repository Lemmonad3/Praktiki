package com.example.praktika12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radioapple(view: View) {
        val photo: ImageView = findViewById(R.id.imageView)
        val image: Int = R.drawable.apple
        val description: String = "This is the logo"
        photo.setImageResource(image)
        photo.setContentDescription(description)

    }

    fun radiopear(view: View) {
        val photo: ImageView = findViewById(R.id.imageView)
        val image: Int = R.drawable.pear
        val description: String = "This is the logo"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
    fun radiogrape(view: View) {
        val photo: ImageView = findViewById(R.id.imageView)
        val image: Int = R.drawable.grape
        val description: String = "This is the logo"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
    fun chekapple(view: View) {
        val photo: ImageView = findViewById(R.id.imageView2)
        val image: Int = R.drawable.apple
        val description: String = "This is the logo"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
    fun chekpear(view: View) {
        val photo: ImageView = findViewById(R.id.imageView3)
        val image: Int = R.drawable.pear
        val description: String = "This is the logo"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
    fun chekgrape(view: View) {
        val photo: ImageView = findViewById(R.id.imageView4)
        val image: Int = R.drawable.grape
        val description: String = "This is the logo"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }
}