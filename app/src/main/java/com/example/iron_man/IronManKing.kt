package com.example.iron_man

class IronManKing {

    var isFly = false

    fun fly() : String{
        if(isFly)
            return "\n mi letim maza faka"
        else{
            isFly = true
            return "\n vzletel"
        }
    }

    fun landed(): String{
        if(isFly){
            isFly = false
            return "\n landed"
        }else{
            return  "\n ya is landed"
        }
    }

    fun handJob(target: Target): String{
        val probability = 50

        if(target.checkIsHit(probability)){
            return "\n Yrrrra hanJob"
        }else{
            return "\n handJob is foled ne konchil"
        }
    }

    fun rocketShot(target: Target): String{
        val probability = 100

        if(target.checkIsHit(probability)){
            return "\n Yrrrra rocketShot is done"
        }else{
            return "\n rocketShot is foled"
        }
    }
}