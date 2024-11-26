package com.example.fragmentexamples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailFragment : Fragment() {

    lateinit var textDetail : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        textDetail = view.findViewById(R.id.text_detail)
        val value1 = arguments?.getInt("param1", 0)
        val value2 = arguments?.getString("param2")
        textDetail.text = "$value1 - $value2"
        return view
    }

    fun updateDetail(item: String) {
        textDetail.text = item
    }
}