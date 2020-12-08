package com.example.iron_man

open class MoveTarget: Target() {

    fun createprotektor(){
        setProbability(0)
    }

    fun destroidprotected(){
        setProbability(100)
    }

    fun move(){
        setProbability(80)
    }

    fun stopmove(){
        setProbability(100)
    }

    fun fly (){
        setProbability(60)
    }

    fun landed(){
        setProbability(100)
    }
}