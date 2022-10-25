package com.example.praktika10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun bt1(view: View) {

        val buttonState:Boolean = false
        val button1:TextView = findViewById(R.id.button1)
        val button2:TextView = findViewById(R.id.button2)
        if (buttonState){
            button1.setVisibility(View.INVISIBLE)
            button2.setVisibility(View.VISIBLE)
        }
        else
        {
            button1.setVisibility(View.VISIBLE)
            button2.setVisibility(View.INVISIBLE)

        }
    }
    fun btn2(view: View) {

        val buttonState:Boolean = false
        val button1:TextView = findViewById(R.id.button1)
        val button2:TextView = findViewById(R.id.button2)
        if (buttonState){
            button1.setVisibility(View.VISIBLE)
            button2.setVisibility(View.INVISIBLE)
        }
        else
        {
            button1.setVisibility(View.INVISIBLE)
            button2.setVisibility(View.VISIBLE)

        }
    }
}