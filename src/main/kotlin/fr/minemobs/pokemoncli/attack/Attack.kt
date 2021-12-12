package fr.minemobs.pokemoncli.attack

import fr.minemobs.pokemoncli.entities.Pokemon
import fr.minemobs.pokemoncli.entities.Trainer

interface Attack {

    fun onUse(target: Pokemon, user: Pokemon, trainer : Trainer) : Boolean

}