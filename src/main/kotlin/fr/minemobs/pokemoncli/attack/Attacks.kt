package fr.minemobs.pokemoncli.attack

import fr.minemobs.pokemoncli.Types
import fr.minemobs.pokemoncli.entities.Pokemon
import fr.minemobs.pokemoncli.entities.Pokemons
import fr.minemobs.pokemoncli.entities.Trainer

enum class Attacks(val attackName: String, val typeOfAttack: TypeOfAttack, val type: Types, val power : Int, var pp : Int, val accuracy : Int) : Attack {

    //Test
    GROWL("Growl", TypeOfAttack.STATUS, Types.NORMAL, 0, 40, 100) {
        override fun onUse(target: Pokemon, user: Pokemon, trainer: Trainer): Boolean {
            val defaultPokemon = Pokemons.valueOf(target.getName().uppercase())
            if(defaultPokemon.get().getAttack() - 6 == target.getAttack()) return false
            target.setAttack(target.getAttack() - 1)
            return true
        }
    },
    SCRATCH("Scratch", TypeOfAttack.PHYSICAL, Types.NORMAL, 40, 35, 100) {
        override fun onUse(target: Pokemon, user: Pokemon, trainer: Trainer): Boolean {
            target.damage(user, this, trainer)
            return true
        }
    },
    TACKLE("Tackle", TypeOfAttack.PHYSICAL, Types.NORMAL, 40, 35, 100) {
        override fun onUse(target: Pokemon, user: Pokemon, trainer: Trainer): Boolean {
            target.damage(user, this, trainer)
            return true
        }
    },
    TAIL_WHIP("Tail Whipe", TypeOfAttack.STATUS, Types.NORMAL, 0, 30, 100) {
        override fun onUse(target: Pokemon, user: Pokemon, trainer: Trainer): Boolean {
            val defaultPokemon = Pokemons.valueOf(target.getName().uppercase())
            if(defaultPokemon.get().getAttack() - 6 == target.getAttack()) return false
            target.setAttack(target.getAttack() - 1)
            return true
        }
    }

    ;
}