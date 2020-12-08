package com.example.iron_man
//1
open class Target {
    private var probability = 100

    var protTarget = 100
    var hptarget = 100



    open fun protAndHpTarget(damedge: Int):String{
            if (protTarget>=0){
                protTarget -= damedge
                return "Прочность щита цели ровна$protTarget%" }
                else{
                hptarget-=damedge
                return "Здоровье цели ровно $hptarget%" }
    }
    fun getProbability():Int{
        return probability
    }
    fun setProbability(int: Int){
        probability = int
    }
    open fun checkIsHit(probabilityOutside: Int): Boolean{
        var minusProb = 100 - getProbability()
        var resultProb = probabilityOutside - minusProb
        var rand = (0..100).random()
        return  rand <= resultProb
    }

}