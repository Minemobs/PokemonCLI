package fr.minemobs.pokemoncli.entities

import fr.minemobs.pokemoncli.Badges

class Player(override val name: String, override val pokemons: ArrayList<Pokemon>,
             override val badges: ArrayList<Badges>
) : Trainer