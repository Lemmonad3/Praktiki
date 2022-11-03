package com.example.praktika19

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView


class FirstFragment : Fragment() {
    internal interface OnFragmentSendDataListener {
        fun onSendData(data: String?)
    }
    private var fragmentSendDataListener: OnFragmentSendDataListener? = null
    var countries = arrayOf<String?>("Мейн-Кун", "Шотландская Вислоухая", "Британская короткошерстная",
        "Мачкин", "Абиссинская")

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            fragmentSendDataListener = context as OnFragmentSendDataListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                context.toString()
                        +  " должен реализовывать интерфейс" +
                        "OnFragmentInteractionListener"
            )
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_first, container,
            false)

        val countriesList = view?.findViewById<ListView>(R.id.countriesList)
        val adapter: ArrayAdapter<String?> = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, countries)
        if (countriesList != null) {
            countriesList.adapter = adapter
        }
        if (countriesList != null) {
            countriesList.onItemClickListener =
                AdapterView.OnItemClickListener { parent, _, position, _ ->
                    val selectedItem: String = parent.getItemAtPosition(position)
                            as String
                    fragmentSendDataListener!!.onSendData(selectedItem)
                }
        }
        return view
    }

}