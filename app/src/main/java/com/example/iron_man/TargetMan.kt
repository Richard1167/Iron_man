package com.example.iron_man

class TargetMan: MoveTarget() {


    fun checkIsHitMan(): Boolean{
        var probabilityOutside = 100
        var minusProb = 100 - getProbability()
        var resultProb = probabilityOutside - minusProb
        var rand = (0..100).random()
        return  rand <= resultProb
    }
}