package com.example.myapplication.move

import com.example.myapplication.Type


interface Move {
    var name: String
    var type: Type
    var hitPoints: Int
}