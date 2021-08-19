package com.example.myapplication.pokemon

import com.example.myapplication.Pokemon
import com.example.myapplication.Type
import com.example.myapplication.move.Ember
import com.example.myapplication.move.Move
import com.example.myapplication.move.Tackle

class Charmander(
    override var name: String = "Charmander",
    override var types: List<Type> = listOf(Type.Fire),
    override var moves: List<Move> = listOf(Tackle(), Ember()),
    override var level: Int = 12,
    override var health: Int = 65,
    override var evolutions: Pair<Int, Pokemon> = Pair(14, Charmeleon())
) : Pokemon {
}