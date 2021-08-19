package com.example.myapplication.pokemon

import com.example.myapplication.Pokemon
import com.example.myapplication.Type
import com.example.myapplication.move.Ember
import com.example.myapplication.move.Move

class Charmeleon(
    override var name: String = "Charmeleon",
    override var types: List<Type> = listOf(Type.Fire),
    override var moves: List<Move> = listOf(Ember()),
    override var level: Int = 14,
    override var health: Int = 70,
    override var evolutions: Pair<Int, Pokemon> = Pair(36, Charizard())
) : Pokemon {
}