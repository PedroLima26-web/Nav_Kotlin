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
        val butao1: Button = view.findViewById(R.id.butao1)
        val butao2: Button = view.findViewById(R.id.butao2)
        butao1.setOnClickListener{Navigation.findNavController(butao1).navigate(R.id.action_firstFragment_to_secondFragment)}
        butao2.setOnClickListener{Navigation.findNavController(butao1).navigate(R.id.action_firstFragment_to_thirdFragment)}
        return view
    }
}