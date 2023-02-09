package com.example.weatherapp.screens

import androidx.lifecycle.ViewModel
import com.example.weatherapp.data.DataOrException
import com.example.weatherapp.model.Weather
import com.example.weatherapp.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: WeatherRepository
) : ViewModel() {

    suspend fun getWeatherData(city: String, units: String) : DataOrException<Weather,Boolean,Exception>{
        return repository.getWeather(cityQuery = city, units = units)
    }
//    val data: MutableState<DataOrException<Weather, Boolean, Exception>> =
//        mutableStateOf(DataOrException(null, true, Exception("")))

//    init {
//        loadWeather()
//    }
//    private fun loadWeather(){
//        getWeater("Seattle")
//    }
//
//    private fun getWeater(city: String) {
//        viewModelScope.launch {
//            if (city.isEmpty()) return@launch
//            data.value.loading = true
//            data.value = repository.getWeather(cityQuery = city)
//            if (data.value.data.toString().isNotEmpty()) data.value.loading = false
//        }
//        Log.d("GET_Weather", "getWeater: ${data.value.data.toString()}")
//    }
}