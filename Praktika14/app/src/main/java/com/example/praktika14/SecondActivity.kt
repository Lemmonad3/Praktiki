package com.example.praktika14

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textViewInfo)

        val arguments: Bundle? = intent.extras

        if (arguments != null){
            val name: String = arguments.get("name").toString()
            val email: String? = arguments.getString("email")
            val age: Int? = arguments.getInt("age")
            textView.text = "Name: $name \nEmail: $email \nAge: $age"
        }

    }

    fun btn2Click(view: View) {
        val nameText: EditText = findViewById(R.id.editTextName2)
        val ageText: EditText = findViewById(R.id.editTextAge2)
        val emailText: EditText = findViewById(R.id.editTextEmail2)
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        val email = emailText.text.toString()
        val intent: Intent = Intent(this@SecondActivity , MainActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)
        startActivity(intent)
    }
}