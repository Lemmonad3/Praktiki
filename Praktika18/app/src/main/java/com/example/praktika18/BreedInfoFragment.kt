package com.example.praktika18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class BreedInfoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_breed_info, container, false)
    }

    fun setSelectedItem(selectedItem: String?) {
        val view = view?.findViewById<TextView>(R.id.textView)
        view?.text = selectedItem

    }
}

