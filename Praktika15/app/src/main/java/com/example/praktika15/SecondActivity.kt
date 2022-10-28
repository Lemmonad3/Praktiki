package com.example.praktika15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val textView: TextView = findViewById(R.id.textView)

        var animal: Animal = Animal()

        val arguments: Bundle? = intent.extras
        if (arguments != null) {
            animal =
                arguments.getParcelable<Animal>(animal.javaClass.simpleName) as Animal
            textView.text =
                "Год рождения: ${animal.getMonth()} \nМесяц рождения:${animal.getAge()} \nПорода: ${animal.getName()}"
        }
    }

    
}
