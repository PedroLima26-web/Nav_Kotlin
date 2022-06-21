package com.example.navegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navegas.R

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_fragment, container, false)
        val butao01: Button = view.findViewById(R.id.butao1)
        val butao02: Button = view.findViewById(R.id.butao2)
        butao01.setOnClickListener{Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)}
        butao02.setOnClickListener{Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment)}
        return view
    }
}