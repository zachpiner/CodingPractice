package com.example.myapplication.move

import com.example.myapplication.Type

class Tackle(
    override var name: String = "Tackle",
    override var type: Type = Type.Normal,
    override var hitPoints: Int = 5
) : Move {
}