package com.example.myapplication.pokemon

import com.example.myapplication.move.Move
import com.example.myapplication.Pokemon
import com.example.myapplication.Type
import com.example.myapplication.move.Growl
import com.example.myapplication.move.Tackle

class Pikachu(
    override var name: String = "Pikachu",
    override var types: List<Type> = listOf(Type.Electric),
    override var moves: List<Move> = listOf(Tackle(), Growl()),
    override var level: Int = 8,
    override var health: Int = 45
) : Pokemon {}