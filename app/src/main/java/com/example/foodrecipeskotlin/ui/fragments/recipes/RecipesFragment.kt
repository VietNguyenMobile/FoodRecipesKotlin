package com.example.foodrecipeskotlin.ui.fragments.recipes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foodrecipeskotlin.R

class RecipesFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_recipes, container, false)


        val view = inflater.inflate(R.layout.fragment_recipes, container, false)
//        view.shimmerFrameLayout

        return view
    }
}