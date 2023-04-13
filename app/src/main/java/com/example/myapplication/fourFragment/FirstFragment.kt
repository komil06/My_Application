package com.example.myapplication.fourFragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_splash, container, false)
        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)

        }, 2000)


    }
}