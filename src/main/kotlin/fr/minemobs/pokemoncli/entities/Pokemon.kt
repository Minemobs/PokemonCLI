package fr.minemobs.pokemoncli.entities

import com.google.gson.Gson
import fr.minemobs.pokemoncli.attack.Attacks
import fr.minemobs.pokemoncli.Types
import kotlin.random.Random

class Pokemon(private var name: String, private var pv : Int, private var attack : Int, private var speed: Int, private var defense: Int, private var level : Int,
              private var xp : Int, private var types : ArrayList<Types>, private var evolutions : Map<Int, String>, private var baseXP : Int, private var attackList: ArrayList<Attacks>) {

    private var isBurn = false
    private var isParalyzed = false
    private var isPoisoned = false
    private var isKO = false

    fun getName(): String {
        return name
    }

    fun getPv() : Int {
        return pv
    }

    fun getAttack() : Int {
        return attack
    }

    fun getDefense() : Int {
        return defense
    }

    fun getSpeed() : Int {
        return speed
    }

    fun getLevel() : Int {
        return level
    }

    fun getXp() : Int {
        return xp
    }

    fun getTypes() : ArrayList<Types> {
        return types
    }

    fun getListOfAttacks() : ArrayList<Attacks> {
        return attackList
    }

    fun isKo() : Boolean {
        return isKO
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setPv(pv: Int) {
        this.pv = pv
    }

    fun setAttack(attack: Int) {
        this.attack = attack
    }

    fun setDefense(defense: Int) {
        this.defense = defense
    }

    fun setSpeed(speed: Int) {
        this.speed = speed
    }

    fun setLevel(level: Int) {
        this.level = level
    }

    fun setXp(xp: Int) {
        this.xp = xp
        if(this.xp >= 100) {
            this.level++
            this.xp -= 100
        }
    }

    fun addAttack(attack: Attacks) {
        if (this.attackList.size == 4) return
        this.attackList.add(attack)
    }

    fun setAttack(attack: Attacks, slot : Int) {
        if(slot >= 4) return
        this.attackList[slot] = attack
    }

    fun setTypes(types: ArrayList<Types>) {
        this.types = types
    }

    fun damage(pokemon: Pokemon, attack: Attacks, trainer: Trainer) : Boolean {
        if(attack.pp == 0) return false
        var stab = 1
        if (pokemon.types.contains(attack.type)) {
            stab = 2
        }

        var doubleType = false

        if(this.types.size == 1) doubleType = true

        var typeEffectiveness = 1
        if(doubleType) {
            for (type in this.types) {
                if(type.getWeaknessAsTypes().contains(attack.type)) typeEffectiveness *= 2
            }
        }else {
            if(this.types[0].getWeaknessAsTypes()[0] == attack.type) {
                typeEffectiveness = 2
            }
        }


        var badgeDamage = 1

        /* Not in gen 1
        if(trainer.badges.isNotEmpty()) {
            badgeDamage = trainer.badges.size - 1
        }*/

        /**
         * https://bulbapedia.bulbagarden.net/wiki/Damage#Damage_calculation
         */
        val damage = ((pokemon.level * 2 / 5 + 2) * attack.power * pokemon.attack / this.defense / 50 + 2) * 1 * badgeDamage * Random.nextInt(217, 256) / 255 * stab *
                typeEffectiveness * 1
        this.pv -= damage
        if(this.pv <= 0) {
            this.isKO = true
            addXP(pokemon)
        }
        return true
    }

    private fun addXP(pokemon: Pokemon) {
        val xp = pokemon.baseXP * (pokemon.level / 7)
        this.xp += xp
    }

    fun clone() : Pokemon {
        val stringPokemon : String = Gson().toJson(this, Pokemon::class.java)
        return Gson().fromJson(stringPokemon, Pokemon::class.java)
    }
}