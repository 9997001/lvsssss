package com.hiddenramblings.tagmo.amiibo.games

class Games3DS(val manager: GamesManager, val id: Long, val games: ArrayList<String?>?) {
    val stringList: String
        get() {
            val usage = StringBuilder()
            games?.forEach { game ->
                if (usage.isEmpty()) usage.append("  ") else usage.append(", ")
                usage.append(game)
            }
            return usage.toString()
        }

    fun hasUsage(name: String?): Boolean {
        return games?.isNotEmpty() == true && games.contains(name)
    }
}