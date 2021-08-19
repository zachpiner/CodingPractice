package com.example.myapplication.move

import com.example.myapplication.Type

class Growl(
    override var name: String = "Growl",
    override var type: Type = Type.Normal,
    override var hitPoints: Int = 0
) : Move {
}