package com.example.praktika10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var buttonState: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linerlayout)
        setTitle("LinerLayout")
    }

    fun test(view: View) {
        val button: TextView = findViewById(R.id.orient1)
        val button1: TextView = findViewById(R.id.gravity1)

        if(buttonState == true){
            button.setVisibility(View.INVISIBLE)
            button1.setVisibility(View.VISIBLE)
            buttonState = false
        }
        else{
            button.setVisibility(View.VISIBLE)
            button1.setVisibility(View.INVISIBLE)
            buttonState = true
        }
    }
}