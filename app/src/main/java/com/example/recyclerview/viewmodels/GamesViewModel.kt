package com.example.recyclerview.viewmodels

import androidx.lifecycle.ViewModel
import com.example.recyclerview.R
import com.example.recyclerview.models.Game

class GamesViewModel: ViewModel(){
    init {
        //constructor
    }
    fun getGameList(): ArrayList<Game>{
        val game: Game = Game("Dead By Daylight",500,"PS4", R.drawable.dbd)
        var gameList:ArrayList<Game> = ArrayList<Game>() //Lista vacia de juegos
        gameList.add(game)

        gameList.add(Game("Resident Evil 2", 1200, "PS4", R.drawable.RE2))
        gameList.add(Game("Resident Evil 3", 1600, "PS4", R.drawable.RE3))
        gameList.add(Game("Resident Evil 4", 1800, "PS4", R.drawable.RE4))
        gameList.add(Game("Detroid Become Human", 700, "PS4", R.drawable.dbd))
        gameList.add(Game("Beyond Two Souls", 1200, "PS4", R.drawable.dbd))
        gameList.add(Game("Resident Evil: Village", 1000, "PS5", R.drawable.dbd))
        gameList.add(Game("The Last Of Us", 1200, "PS4", R.drawable.TLOU))
        gameList.add(Game("The Quarry", 3000, "XBOX ONE", R.drawable.TQ))
        gameList.add(Game("Until Dawn", 1800, "PS4", R.drawable.UD))
        gameList.add(Game("Until Dawn", 1100, "PS4", R.drawable.UD))

        ///
        return gameList //Regresamos la lista de juegos


    }

}