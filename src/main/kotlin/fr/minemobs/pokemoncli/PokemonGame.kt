package fr.minemobs.pokemoncli

import fr.minemobs.pokemoncli.entities.Player
import fr.minemobs.pokemoncli.entities.Pokemons
import fr.minemobs.pokemoncli.entities.Trainer
import fr.minemobs.pokemoncli.utils.Color
import fr.minemobs.pokemoncli.utils.Console

fun main() {
    val color = Color()

    println(color.RED +
            " ____       _                                 ____  _____ ____   \n" +
            "|  _ \\ ___ | | _____ _ __ ___   ___  _ __    |  _ \\| ____|  _ \\  \n" +
            "| |_) / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\   | |_) |  _| | | | | \n" +
            "|  __/ (_) |   <  __/ | | | | | (_) | | | |  |  _ <| |___| |_| | \n" +
            "|_|   \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|  |_| \\_\\_____|____/  \n" +
            "                                                                 \n" +
            color.GREEN +
            "  ____ _     ___    _____ ____ ___ _____ ___ ___  _   _ \n" +
            " / ___| |   |_ _|  | ____|  _ \\_ _|_   _|_ _/ _ \\| \\ | |\n" +
            "| |   | |    | |   |  _| | | | | |  | |  | | | | |  \\| |\n" +
            "| |___| |___ | |   | |___| |_| | |  | |  | | |_| | |\\  |\n" +
            " \\____|_____|___|  |_____|____/___| |_| |___\\___/|_| \\_|" + color.RESET)

    /*
    Player creation
     */

    println("")
    Console.println("Hello there !")
    Console.println("Welcome to the world of Pokémon !")
    Console.println("People call me the Pokémon PROF !")
    Console.println("This world is inhabited by creatures called Pokémon!")
    Console.println("For some people, Pokémon are pets. Others use them for fights.")
    Console.println("Others use them for fight.")
    Console.println("Myself ...")
    Console.println("I study Pokémon as a profession.")
    Console.println("First, what is your name ?")
    val name: String = readLine()!!
    val player = Player(name, ArrayList(), arrayListOf())
    Console.println("Right! So your name is $name !")
    Console.println("This is my grand-son. He's been your rival since you were a baby.")
    Console.println("... Erm, what is his name again ?")
    val rivalName : String = readLine()!!
    val rival : Trainer = Player(rivalName, ArrayList(), arrayListOf())
    Console.println("That's right ! I remember now !")
    Console.println("His name is $rivalName !")
    Console.println("$name !")
    Console.println("Your very own Pokemon legend is about to unfold !")
    Console.println("A world of dreams and adventures with Pokémon awaits ! Let's go !")

    /*
    Route 01
     */

    println("\n" +
            "    ____  ____  __  ______________   ____ ___\n" +
            "   / __ \\/ __ \\/ / / /_  __/ ____/  / __ <  /\n" +
            "  / /_/ / / / / / / / / / / __/    / / / / / \n" +
            " / _, _/ /_/ / /_/ / / / / /___   / /_/ / /  \n" +
            "/_/ |_|\\____/\\____/ /_/ /_____/   \\____/_/   ")
    Console.println("", 5)
    Console.println("OAK: Hey! Wait! Don't go out!")
    Console.println("OAK: It's unsafe! Wild Pokémon live in tall grass!")
    Console.println("You need your own Pokémon for your protection.")
    Console.println("I know! Here, come with me !")

    /*
    Professor's laboratory
     */

    println("\n" +
            "    ____             ____                         _          __      __                     __                  \n" +
            "   / __ \\_________  / __/__  ______________  ____( )_____   / /___ _/ /_  ____  _________ _/ /_____  _______  __\n" +
            "  / /_/ / ___/ __ \\/ /_/ _ \\/ ___/ ___/ __ \\/ ___/// ___/  / / __ `/ __ \\/ __ \\/ ___/ __ `/ __/ __ \\/ ___/ / / /\n" +
            " / ____/ /  / /_/ / __/  __(__  |__  ) /_/ / /    (__  )  / / /_/ / /_/ / /_/ / /  / /_/ / /_/ /_/ / /  / /_/ / \n" +
            "/_/   /_/   \\____/_/  \\___/____/____/\\____/_/    /____/  /_/\\__,_/_.___/\\____/_/   \\__,_/\\__/\\____/_/   \\__, /  \n" +
            "                                                                                                       /____/   ")
    Console.println("", 5)
    Console.println("$rivalName: Gramps! I'm fed up with waiting!")
    Console.println("Oak: $rivalName? Let me think ...")
    Console.println("Oh, that's right, I told you to come! Just wait!")
    Console.println("Here, $name !")
    Console.println("There are 3 pokémon here!")
    Console.println("Haha!")
    Console.println("They are inside the pokéballs.")
    Console.println("When i was young, I was a serious pokémon trainer!")
    Console.println("In my old age, I have only 3 left, but you can have one! Choose!")
    Console.println("$rivalName: Hey! Gramps! What about me?")
    Console.println("Oak: Be patient! $rivalName, you can have one too!")
    println("(Which pokémon do you want to choose ?) \n" +
            "(Bulbasaur[1], Charmander[2], Squirtle[3])")
    var pokemonChoosen = 0
    while (pokemonChoosen == 0){
        try {
            when (val value = readLine()!!.toInt()) {
                1, 2, 3 -> pokemonChoosen = value
                else -> println("Please write a number between 1 and 3")
            }
        } catch (e: NumberFormatException) {
            println("Please write a number between 1 and 3")
        }
    }

    when (pokemonChoosen) {
        1 -> {
            player.addPokemon(Pokemons.BULBASAUR.get())
        }
        2 -> {
            player.addPokemon(Pokemons.CHARMANDER.get())
        }
        3 -> {
            player.addPokemon(Pokemons.SQUIRTLE.get())
        }
    }
    Console.println("$name received a ${player.pokemons[0].getName()} !")
    Console.println("Do you want to give a nickname to ${player.pokemons[0].getName()}?")
    var giveNicknameInt = 0
    while (giveNicknameInt == 0) {
        val giveNickname = readLine()!!
        when (giveNickname) {
            "Yes" -> {
                giveNicknameInt = 1
                println("Please write the nickname of your pokémon")
                player.pokemons[0].setName(readLine()!!)
            }
            "No" -> giveNicknameInt = 1
            else -> {
                println("Please write [${color.GREEN}Yes${color.RESET}] or [${color.RED}No${color.RESET}]")
            }
        }
    }

    Console.println("$rivalName: I'll take this one, then!")

    when (pokemonChoosen) {
        1 -> {
            rival.addPokemon(Pokemons.CHARMANDER.get())
        }
        2 -> {
            rival.addPokemon(Pokemons.SQUIRTLE.get())
        }
        3 -> {
            rival.addPokemon(Pokemons.BULBASAUR.get())
        }
    }

    println("$rivalName received a ${rival.pokemons[0].getName()}!")
    Console.println("$rivalName: Wait \n $name!")
    Console.println("Let's check out our pokémon!")
    Console.println("Come on, I'll take you on!")
    /*
    Fight
     */
    player.setInFight(true)
    println("$rivalName wants to fight!")
    //TODO: Fight system
}