package com.example.myapplication

import com.example.myapplication.move.Move

interface Pokemon {
    var name: String
    var types: List<Type>
    var moves: List<Move>
    var level: Int
    var health: Int
    var evolutions: Pair<Int, Pokemon>

}
