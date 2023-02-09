package com.example.weatherapp.repository

import com.example.weatherapp.data.WeatherDao
import com.example.weatherapp.model.Favorite
import kotlinx.coroutines.flow.Flow

import javax.inject.Inject

class WeatherDbRepository @Inject constructor(private val weatherDao: WeatherDao){
    fun getFavorites(): Flow<List<Favorite>> = weatherDao.getFavorites()
    suspend fun insertFavorite(favorite: Favorite) = weatherDao.insertFavorite(favorite)
    suspend fun updateFavorite(favorite:Favorite) = weatherDao.updateFavorite(favorite)
    suspend fun deleteAllFavorites() = weatherDao.deleteAllFavorites()
    suspend fun deleteFavorite(favorite: Favorite) = weatherDao.deleteById(favorite)
    suspend fun getFavoriteById(city:String) = weatherDao.getFavoriteById(city)

    fun getUnits(): Flow<List<com.example.weatherapp.data.Unit>> = weatherDao.getUnit()
    suspend fun insertUnit(unit: com.example.weatherapp.data.Unit) = weatherDao.insertUnit(unit)
    suspend fun updateUnit(unit: com.example.weatherapp.data.Unit) = weatherDao.updateUnit(unit)
    suspend fun deleteAllUnits() = weatherDao.deleteAllUnits()
    suspend fun deleteUnit(unit: com.example.weatherapp.data.Unit) = weatherDao.deleteUnit(unit)
}