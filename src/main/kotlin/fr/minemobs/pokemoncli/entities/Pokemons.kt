package fr.minemobs.pokemoncli.entities

import fr.minemobs.pokemoncli.Types
import fr.minemobs.pokemoncli.attack.Attacks

enum class Pokemons(private var pokemon: Pokemon) {

    BULBASAUR(Pokemon("Bulbasaur", 45, 49, 49, 45, 5, 0, arrayListOf(Types.GRASS, Types.POISON),
        hashMapOf(0 to "BULBASAUR", 16 to "IVYSAUR", 32 to "VENUSAUR"), 64, arrayListOf(Attacks.GROWL))),
    IVYSAUR(Pokemon("Ivysaur", 60, 62, 60, 63, 16, 0, arrayListOf(Types.GRASS, Types.POISON),
        hashMapOf(16 to "IVYSAUR", 32 to "VENUSAUR"), 141, arrayListOf())),
    VENUSAUR(Pokemon("Venusaur", 80, 82, 80, 83, 32, 0, arrayListOf(Types.GRASS, Types.POISON),
        hashMapOf(32 to "VENUSAUR"), 236, arrayListOf())),
    CHARMANDER(Pokemon("Charmander", 39, 52, 65, 43, 5, 0, arrayListOf(Types.FIRE),
        hashMapOf(0 to "CHARMANDER", 16 to "CHARMELEON", 36 to "CHARIZARD"), 65, arrayListOf(Attacks.GROWL))),
    CHARMELEON(Pokemon("Charmander", 58, 64, 80, 58, 16, 0, arrayListOf(Types.FIRE),
        hashMapOf(16 to "CHARMELEON", 36 to "CHARIZARD"), 142, arrayListOf())),
    CHARIZARD(Pokemon("Charizard", 45, 49, 49, 45, 36, 0, arrayListOf(Types.FIRE, Types.FLYING),
        hashMapOf(36 to "CHARIZARD"), 209, arrayListOf())),
    SQUIRTLE(Pokemon("Squirtle", 45, 49, 49, 45, 5, 0, arrayListOf(Types.WATER),
        hashMapOf(0 to "SQUIRTLE", 16 to "WARTORTLE", 36 to "BLASOISE"), 66, arrayListOf(Attacks.GROWL))),
    WARTORTLE(Pokemon("Wartortle", 45, 49, 49, 45, 16, 0, arrayListOf(Types.WATER),
        hashMapOf(16 to "WARTORTLE", 36 to "BLASOISE"), 143, arrayListOf())),
    BLASTOISE(Pokemon("Blastoise", 45, 49, 49, 45, 36, 0, arrayListOf(Types.WATER),
        hashMapOf(36 to "BLASOISE"), 210, arrayListOf())),
    ;

    fun get() : Pokemon {
        return pokemon
    }

}