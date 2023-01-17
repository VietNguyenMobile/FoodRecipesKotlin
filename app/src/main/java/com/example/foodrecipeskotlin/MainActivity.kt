package com.example.foodrecipeskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.foodrecipeskotlin.databinding.ActivityMainBinding
import com.example.foodrecipeskotlin.ui.fragments.favorites.FavoriteRecipesFragment
import com.example.foodrecipeskotlin.ui.fragments.foodjoke.FoodJokeFragment
import com.example.foodrecipeskotlin.ui.fragments.recipes.RecipesFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

//    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding
//    val bottomNavigationView: NavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(RecipesFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.foodJokeFragment -> replaceFragment(FoodJokeFragment())
                R.id.favoriteRecipesFragment -> replaceFragment(FavoriteRecipesFragment())
                R.id.recipesFragment -> replaceFragment(RecipesFragment())
                else -> {
                }
            }
            true
        }

//        navController = findNavController(R.id.fragmentContainerView)
//        val appBarConfiguration = AppBarConfiguration(setOf(
//            R.id.recipesFragment,
//            R.id.favoriteRecipesFragment,
//            R.id.foodJokeFragment
//        ))

//        bottomNavigationView?.setupWithNavController(navController)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        binding.bottomNavigationView.setupWithNavController(navController)
//        setupActionBarWithNavController(navController, appBarConfiguration)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }

//    private fun init(view: View) {
//        navController = Navigation.findNavController(view)
////        mAuth = FirebaseAuth.getInstance()
//    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }
}