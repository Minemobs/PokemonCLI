package fr.minemobs.pokemoncli.entities

import fr.minemobs.pokemoncli.Types

enum class Pokemons(private var pokemon: Pokemon) {

    BULBASAUR(Pokemon("Bulbasaur", 45, 49, 49, 45, 5, 0, arrayListOf(Types.PLANT), hashMapOf(0 to "BULBASAUR", 16 to "IVYSAUR", 32 to "VENUSAUR"))),
    IVYSAUR(Pokemon("Ivysaur", 60, 62, 60, 63, 16, 0, arrayListOf(Types.PLANT), hashMapOf(16 to "IVYSAUR", 32 to "VENUSAUR"))),
    VENUSAUR(Pokemon("Venusaur", 80, 82, 80, 83, 32, 0, arrayListOf(Types.PLANT), hashMapOf(32 to "VENUSAUR"))),
    CHARMANDER(Pokemon("Charmander", 39, 52, 65, 43, 5, 0, arrayListOf(Types.PLANT), hashMapOf(0 to "CHARMANDER", 16 to "CHARMELEON",
        36 to "CHARIZARD"))),
    CHARMELEON(Pokemon("Charmander", 58, 64, 80, 58, 5, 0, arrayListOf(Types.PLANT), hashMapOf(16 to "CHARMELEON", 36 to "CHARIZARD"))),
    CHARIZARD(Pokemon("Charizard", 45, 49, 49, 45, 5, 0, arrayListOf(Types.PLANT), hashMapOf(36 to "CHARIZARD"))),
    SQUIRTLE(Pokemon("Squirtle", 45, 49, 49, 45, 5, 0, arrayListOf(Types.PLANT), hashMapOf(0 to "SQUIRTLE", 16 to "WARTORTLE", 36 to "BLASOISE"))),
    WARTORTLE(Pokemon("Wartortle", 45, 49, 49, 45, 5, 0, arrayListOf(Types.PLANT), hashMapOf(16 to "WARTORTLE", 36 to "BLASOISE"))),
    BLASTOISE(Pokemon("Blastoise", 45, 49, 49, 45, 5, 0, arrayListOf(Types.PLANT), hashMapOf(36 to "BLASOISE"))),
    ;

    fun get() : Pokemon {
        return pokemon
    }

}