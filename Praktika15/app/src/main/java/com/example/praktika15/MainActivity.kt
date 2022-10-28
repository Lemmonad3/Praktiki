package com.example.praktika15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnClick(view: View) {
        val nameText: TextView = findViewById(R.id.editTextName)
        val monthText: TextView = findViewById(R.id.editTextMonth)
        val ageText: TextView = findViewById(R.id.editTextAge)
        val name = nameText.text.toString()
        val month= monthText.text.toString().toInt()
        val age = ageText.text.toString().toInt()
        val animal: Animal = Animal(name, age, month)

        val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)

        intent.putExtra(animal.javaClass.simpleName, animal)
        startActivity(intent)
    }
}


