package com.example.pokemonapi.data.repositories

import androidx.lifecycle.liveData
import com.example.pokemonapi.common.Resource
import com.example.pokemonapi.data.remote.apiservices.PokemonApiService
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val service: PokemonApiService) {

    fun fetchPokemonNames() = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(service.fetchPokemonNames()))
        } catch (ioException: Exception) {
            emit(Resource.Error(message = ioException.localizedMessage ?: "Error"))
        }

    }
}