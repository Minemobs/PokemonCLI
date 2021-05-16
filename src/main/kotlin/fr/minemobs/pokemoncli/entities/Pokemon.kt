package fr.minemobs.pokemoncli.entities

import fr.minemobs.pokemoncli.Attack
import fr.minemobs.pokemoncli.Types
import kotlin.random.Random

class Pokemon(private var name: String, private var pv : Int, private var attack : Int, private var speed: Int, private var defense: Int, private var level : Int, private var xp : Int, private var types : ArrayList<Types>, private var evolutions : Map<Int, Pokemons>) {

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

    fun setTypes(types: ArrayList<Types>) {
        this.types = types
    }

    fun damage(pokemon: Pokemon, attack: Attack, trainer: Trainer) {
        var stab : Int = 1
        if (pokemon.types.contains(attack.getType())) {
            stab = 2
        }

        var doubleType = false

        if(this.types.size == 1) doubleType = true

        var typeEffectiveness = 1
        if(doubleType) {
            for (type in this.types) {
                if(type.getWeaknessAsTypes().contains(attack.getType())) typeEffectiveness *= 2
            }
        }else {
            if(this.types[0].getWeaknessAsTypes()[0] == attack.getType()) {
                typeEffectiveness = 2
            }
        }

        var badgeDamage = 1

        if(trainer.badges.isNotEmpty()) {
            badgeDamage = trainer.badges.size - 1
        }

        /**
         * https://bulbapedia.bulbagarden.net/wiki/Damage#Damage_calculation
         */
        var damage = ((pokemon.level * 2 / 5 + 2) * pokemon.attack / this.defense / 50 + 2) * 1 * badgeDamage * Random.nextInt(217, 256) / 255 * stab *
                typeEffectiveness * 1
        this.pv -= damage
        if(this.pv <= 0) this.isKO = true
    }
}