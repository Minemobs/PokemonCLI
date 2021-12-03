package fr.minemobs.pokemoncli.utils

import org.apache.commons.lang3.StringUtils

class Console {

    companion object {

        val color = Color()

        fun println(message: Any?, timeInSec: Int) {
            println(message, (timeInSec * 1000).toLong())
        }

        private fun println(message: Any?, timeInMilSec: Long) {
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

        fun asciiBox(str: String): String {
            val lineBreak = str.split("\n").map { it.trim() }.filterNot { it.isEmpty() || it.isBlank() }
            val boxWidth = lineBreak.sortedWith(compareBy { it.length }).last().length + 4
            val top = "╔" + "═".repeat(boxWidth) + "╗"
            val middle = StringBuilder()
            lineBreak.filterNot { it.isBlank() || it.isEmpty() }.forEach {
                middle.append("║").append(center(it, boxWidth)).append("║")
                if(it != lineBreak.last()) {
                    middle.append("\n")
                }
            }
            val bottom = "╚" + "═".repeat(boxWidth) + "╝"
            return listOf(top, middle, bottom).joinToString("\n")
        }

        /**
         * @param title The title of the box
         * @param content The content of the box
         *
         * The title should not contain any line break
         */
        fun asciiBox(title: String, content: String) : String {
            val lineBreak = content.split("\n").map { it.trim() }.filterNot { it.isEmpty() || it.isBlank() }
            var boxWidth = lineBreak.sortedWith(compareBy { it.length }).last().length + 4
            if(title.length > boxWidth - 4) {
                boxWidth = title.length + 4
            }
            val top = "╔" + "═".repeat(boxWidth) + "╗"
            val middleTitle = "║" + color.ANSI_ITALIC + StringUtils.center(title, boxWidth) + color.RESET + "║"
            val bottomTitle = "╟" + "═".repeat(boxWidth) + "╢"
            val middle = StringBuilder()
            lineBreak.filterNot { it.isBlank() || it.isEmpty() }.forEach {
                middle.append("║").append(center(it, boxWidth)).append("║")
                if(it != lineBreak.last()) {
                    middle.append("\n")
                }
            }
            val bottom = "╚" + "═".repeat(boxWidth) + "╝"
            return listOf(top, middleTitle, bottomTitle, middle, bottom).joinToString("\n")
        }

        private fun center(text: String?, len: Int): String? {
            val out = String.format("%" + len + "s%s%" + len + "s", "", text, "")
            val mid = (out.length / 2).toFloat()
            val start = mid - len / 2
            val end = start + len
            return out.substring(start.toInt(), end.toInt())
        }
    }
}