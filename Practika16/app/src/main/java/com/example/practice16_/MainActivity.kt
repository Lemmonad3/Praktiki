package com.example.practice16_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sharedP = this.getSharedPreferences("Theme", MODE_PRIVATE)
        val theme = sharedP.getInt("my_theme", R.style.NightTheme)
        setTheme(theme)
        setContentView(R.layout.activity_main)
    }
    fun switchClick(view: View) {
        val shared = getSharedPreferences("Theme", MODE_PRIVATE)
        val sw = view as Switch
        if (sw.isChecked){
            shared.edit().clear().apply()
            shared.edit().putInt("my_theme", R.style.LightTheme).apply()
            recreate()
        }
        else{
            shared.edit().clear().apply()
            shared.edit().putInt("my_theme", R.style.NightTheme).apply()
            recreate()
        }
    }


}