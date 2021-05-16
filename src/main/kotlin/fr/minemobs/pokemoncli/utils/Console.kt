package fr.minemobs.pokemoncli.utils

class Console {

    companion object {
        fun println(message: Any?, timeInSec: Int) {
            println(message, (timeInSec * 1000).toLong())
        }

        fun println(message: Any?, timeInMilSec: Long) {
            val textes: CharArray = message.toString().toCharArray()
            for (texte in textes) {
                Thread.sleep(timeInMilSec)
                print(texte)
            }
            println()
        }

        fun println(message: Any?) {
            //println(message, 250L)
            println(message, 0L)
        }
    }
}