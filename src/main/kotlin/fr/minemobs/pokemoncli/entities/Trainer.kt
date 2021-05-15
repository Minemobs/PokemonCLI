package fr.minemobs.pokemoncli.entities

interface Trainer {

    val name : String
    val pokemons: ArrayList<Pokemon>

    fun name() : String {
        return name
    }

    fun getAllPokemons() : ArrayList<Pokemon> {
        return pokemons
    }

    fun addPokemon(pokemon: Pokemon) {
        if(pokemons.size == 6) {
            return
        }else if(pokemons.size > 6) {
            pokemons.subList(7, pokemons.size).clear()
            return
        }
        pokemons.add(pokemon)
    }
}
