package com.example.praktika13

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View) {
        val dollText: EditText = findViewById(R.id.editTextNumber)
        val rubText: EditText = findViewById(R.id.editTextNumber2)
        var resultText: TextView = findViewById(R.id.textView)
        val doll:Int? = dollText.text.toString().toInt()
        val rub:Int? = rubText.text.toString().toInt()


         if (doll != null && rub != null){

            val result = doll * rub
             resultText.text = "Результат : $result"

         }
        if (doll == null){

            val toast = Toast.makeText(this, "Введите курс обмена!", Toast.LENGTH_LONG)
            toast.show()
        }
        if (rub == null){

            val toast = Toast.makeText(this, "Введите сумму для обмена!", Toast.LENGTH_LONG)
            toast.show()
        }
    }

}