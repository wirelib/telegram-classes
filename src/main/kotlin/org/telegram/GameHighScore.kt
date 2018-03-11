package org.telegram

data class GameHighScore(
        /**
        * Position in high score table for the game
        */
        val position: Int,

        /**
        * User
        */
        val user: User,

        /**
        * Score
        */
        val score: Int
)
