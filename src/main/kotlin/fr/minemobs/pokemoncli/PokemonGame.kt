package fr.minemobs.pokemoncli

import fr.minemobs.pokemoncli.entities.Player
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
    val player : Trainer = Player(name, ArrayList())
    Console.println("Right! So your name is $name !")
    Console.println("This is my grand-son. He's been your rival since you were a baby.")
    Console.println("... Erm, what is his name again ?")
    val rivalName : String = readLine()!!
    val rival : Trainer = Player(rivalName, ArrayList())
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
    println("In dev")
}