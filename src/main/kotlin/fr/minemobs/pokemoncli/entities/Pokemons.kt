package fr.minemobs.pokemoncli.entities

import fr.minemobs.pokemoncli.Types

enum class Pokemons(private var pokemon: Pokemon) {

    BULBASAUR(Pokemon("Bulbasaur", 45, 49, 49, 45, 5, 0, arrayListOf(Types.PLANT), hashMapOf(0 to BULBASAUR)));

    fun get() : Pokemon {
        return pokemon
    }

}