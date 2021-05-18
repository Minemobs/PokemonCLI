package fr.minemobs.pokemoncli.attack

import fr.minemobs.pokemoncli.Types
import fr.minemobs.pokemoncli.entities.Pokemon
import fr.minemobs.pokemoncli.entities.Pokemons
import fr.minemobs.pokemoncli.entities.Trainer

enum class Attacks(private val attackName: String, private val typeOfAttack: TypeOfAttack, private val type: Types) : Attack {

    //Test
    GROWL("Growl", TypeOfAttack.STATUS, Types.NORMAL) {
        override fun onUse(target: Pokemon, user: Pokemon, trainer: Trainer): Boolean {
            val defaultPokemon = Pokemons.valueOf(target.getName().uppercase())
            if(defaultPokemon.get().getAttack() - 6 == target.getAttack()) return false
            target.setAttack(target.getAttack() - 1)
            return true
        }
    },

    ;

    fun getAttackName() : String {
        return attackName
    }

    fun getTypeOfAttack() : TypeOfAttack {
        return typeOfAttack
    }

    fun getType() : Types {
        return type
    }

}