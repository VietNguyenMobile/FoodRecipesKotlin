package com.example.foodrecipeskotlin.viewmodels

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Parcelable
import androidx.lifecycle.*
import com.example.foodrecipeskotlin.data.Repository
import com.example.foodrecipeskotlin.data.database.entities.FavoritesEntity
import com.example.foodrecipeskotlin.data.database.entities.FoodJokeEntity
import com.example.foodrecipeskotlin.data.database.entities.RecipesEntity
import com.example.foodrecipeskotlin.models.FoodJoke
import com.example.foodrecipeskotlin.models.FoodRecipe
import com.example.foodrecipeskotlin.util.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

class MainViewModel {

    /** RETROFIT */
//    var recipesResponse: MutableLiveData<NetworkResult<FoodRecipe>> = MutableLiveData()
//    var searchedRecipesResponse: MutableLiveData<NetworkResult<FoodRecipe>> = MutableLiveData()
//    var foodJokeResponse: MutableLiveData<NetworkResult<FoodJoke>> = MutableLiveData()
}