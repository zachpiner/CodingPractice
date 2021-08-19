package com.example.myapplication.move

import com.example.myapplication.Type

class Ember(
    override var name: String = "Ember",
    override var type: Type = Type.Fire,
    override var hitPoints: Int = 20
) : Move {
}