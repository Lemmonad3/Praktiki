package com.example.praktika19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),FirstFragment.OnFragmentSendDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSendData(selectedItem: String?) {
        val fragment = supportFragmentManager.findFragmentById(R.id.detailFragment) as SecondFragment?
        if (fragment != null && fragment.isVisible){
            fragment.setSelectedItem(selectedItem)
        }
        else{
            val intent = Intent(applicationContext, DetailActivity::class.java)
            intent.putExtra(DetailActivity.SELECTED_ITEM, selectedItem)
            startActivity(intent)
        }
        fragment?.setSelectedItem(selectedItem)
    }


}