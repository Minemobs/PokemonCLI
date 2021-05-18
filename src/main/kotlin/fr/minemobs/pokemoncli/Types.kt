package fr.minemobs.pokemoncli

import java.util.function.Consumer

enum class Types(private val weakness: ArrayList<String>, private val resistances: ArrayList<String>, private val immunity: ArrayList<String>) {

    NORMAL(arrayListOf(), arrayListOf("FIGHTING"), arrayListOf("GHOST")),
    FIRE(arrayListOf("WATER", "ROCK"), arrayListOf("GRASS", "FIRE", "ICE", "BUG"), arrayListOf()),
    WATER(arrayListOf("GRASS", "ELECTRIC"), arrayListOf("FIRE", "WATER", "GROUND", "ROCK"), arrayListOf()),
    GRASS(arrayListOf("FIRE", "POISON", "BUG"), arrayListOf("WATER", "GRASS", "ELECTRIC"), arrayListOf()),
    ELECTRIC(arrayListOf("GRASS", "ELECTRIC"), arrayListOf("FLYING"), arrayListOf()),
    ICE(arrayListOf("FIRE", "FIGHTING", "ROCK"), arrayListOf("ICE", "GROUND", "FLYING", "DRAGON"), arrayListOf()),
    FIGHTING(arrayListOf("FLYING", "PSYCHIC"), arrayListOf("BUG", "ROCK"), arrayListOf("GHOST")),
    POISON(arrayListOf("GROUND", "PSYCHIC"), arrayListOf("GRASS", "FIGHTING", "BUG"), arrayListOf()),
    GROUND(arrayListOf("WATER", "GRASS", "ICE"), arrayListOf("POISON", "ROCK"), arrayListOf("ELECTRIC")),
    FLYING(arrayListOf("ELECTRIC", "ICE", "ROCK"), arrayListOf("GRASS", "FIGHTING", "BUG"), arrayListOf("GROUND")),
    PSYCHIC(arrayListOf("BUG", "GHOST"), arrayListOf("FIGHTING", "PSYCHIC"), arrayListOf()),
    BUG(arrayListOf("FIRE", "FLYING", "ROCK"), arrayListOf("GRASS", "FIGHTING", "GROUND"), arrayListOf()),
    ROCK(arrayListOf("WATER", "GRASS", "FIGHTING"), arrayListOf("NORMAL", "FIRE", "POISON", "BUG"), arrayListOf()),
    GHOST(arrayListOf("GHOST"), arrayListOf("POISON"), arrayListOf("NORMAL", "FIGHTING")),
    DRAGON(arrayListOf("DRAGON", "ICE"), arrayListOf("FIRE", "WATER", "GRASS", "ELECTRIC"), arrayListOf()),
    ;

    fun getWeaknessAsTypes(): ArrayList<Types> {
        val weakness: ArrayList<Types> = ArrayList()
        this.weakness.forEach(Consumer { t -> weakness.add(valueOf(t)) })
        return weakness
    }

    fun getWeakness(): ArrayList<String> {
        return weakness
    }


    fun getResistancesAsTypes(): ArrayList<Types> {
        val resistances: ArrayList<Types> = ArrayList()
        this.resistances.forEach(Consumer { t -> resistances.add(valueOf(t)) })
        return resistances
    }

    fun getResistances(): ArrayList<String> {
        return resistances
    }
}