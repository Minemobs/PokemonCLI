package fr.minemobs.pokemoncli

enum class Attack(private val attackName: String, private val type: Types) {

    //Test
    POISON("Poison", Types.FIRE);

    fun getAttackName() : String {
        return attackName
    }

    fun getType() : Types {
        return type
    }

}