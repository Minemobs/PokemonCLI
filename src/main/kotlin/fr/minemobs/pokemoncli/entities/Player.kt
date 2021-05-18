package fr.minemobs.pokemoncli.entities

import fr.minemobs.pokemoncli.Badges

class Player(override val name: String, override val pokemons: ArrayList<Pokemon>, override val badges: ArrayList<Badges>) : Trainer {

    private val pc : ArrayList<Pokemon> = arrayListOf()
    private var inFight = false

    fun addPokemon(pokemon: Pokemons) {
        if(pokemons.size == 6) {
            pc.add(pokemon.get().clone())
        } else {
            pokemons.add(pokemon.get())
        }
    }

    fun setPokemon(pokemon: Pokemons, slotID : Int) {
        var slot = slotID
        if(slot > 6) {
            slot = 6
        }
        pokemons[slot] = pokemon.get().clone()
    }

    fun isInFight() : Boolean {
        return inFight
    }

    fun setInFight(inFight: Boolean) {
        this.inFight = inFight
    }
}