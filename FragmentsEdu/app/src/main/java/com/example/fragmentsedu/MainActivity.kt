package com.example.fragmentsedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),FirstFragment.OnFragmentSendDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSendData(selectedItem: String?) {
        val fragment = supportFragmentManager.findFragmentById(R.id.secondFragment) as SecondFragment?
        fragment?.setSelectedItem(selectedItem)
    }

}