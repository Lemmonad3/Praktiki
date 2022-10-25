package com.example.praktika14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText:TextView = findViewById(R.id.editTextName)
        val editText2:TextView = findViewById(R.id.editTextAge)
        val editText3:TextView = findViewById(R.id.editTextEmail)

        val arguments: Bundle? = intent.extras

        if (arguments != null){
            val name: String = arguments.get("name").toString()
            val email: String? = arguments.getString("email")
            val age: Int? = arguments.getInt("age")
            editText.text = "$name"
            editText2.text = "$age"
            editText3.text = "$email"
        }
    }

    fun btn1Click(view: View) {

        val nameText: TextView = findViewById(R.id.editTextName)
        val ageText: TextView = findViewById(R.id.editTextAge)
        val emailText: TextView = findViewById(R.id.editTextEmail)
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        val email = emailText.text.toString()
        val intent: Intent = Intent(this@MainActivity,SecondActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)
        startActivity(intent)
    }
}