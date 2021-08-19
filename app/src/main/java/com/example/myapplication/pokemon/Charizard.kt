package com.example.myapplication.pokemon

import com.example.myapplication.Pokemon
import com.example.myapplication.Type
import com.example.myapplication.move.Ember
import com.example.myapplication.move.Move

class Charizard(
    override var name: String = "Charizard",
    override var types: List<Type> = listOf(Type.Fire, Type.Dragon),
    override var moves: List<Move> = listOf(Ember()),
    override var level: Int = 36,
    override var health: Int = 200,
    override var evolutions: Pair<Int, Pokemon> = Pair(Int.MAX_VALUE, Pikachu())
) : Pokemon {
}