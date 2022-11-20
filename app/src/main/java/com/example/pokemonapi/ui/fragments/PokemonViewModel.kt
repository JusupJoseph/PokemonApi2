package com.example.pokemonapi.ui.fragments

import com.example.pokemonapi.base.BaseViewModel
import com.example.pokemonapi.data.repositories.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val repository: PokemonRepository
) : BaseViewModel() {
    fun fetchPokemonNames() = repository.fetchPokemonNames()
}