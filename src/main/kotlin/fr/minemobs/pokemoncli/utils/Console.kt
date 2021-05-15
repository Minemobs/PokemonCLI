package fr.minemobs.pokemoncli.utils

class Console {

    companion object {
        fun println(text: String, timeInSec: Int) {
            Thread.sleep((timeInSec * 1000).toLong())
            println(text)
        }

        fun println(text: String) {
            Thread.sleep(2000)
            kotlin.io.println(text)
        }

        fun print(text: String, timeInSec: Int) {
            Thread.sleep((timeInSec * 1000).toLong())
            print(text)
        }

        fun print(text: String) {
            Thread.sleep(2000)
            kotlin.io.print(text)
        }
    }

}