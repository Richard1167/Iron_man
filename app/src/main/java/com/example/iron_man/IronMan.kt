package com.example.iron_man

class IronMan:MoveTarget() {
    var isflay = false
    var probobilityAll = 0

    fun onFlyIronMan(): String {
        probobilityAll = 20
        if (isflay) {
            return "\nТы уже выше неба!"
        } else {
            isflay = true
            return "\nТы взлетел ты летишь!!"
        }
    }

    fun landedIron(): String {
        probobilityAll = 0
        if (isflay) {
            isflay = false
            return "\n Приземление произошло успешно!"
        } else {
            return "\n Я уже на земле!"
        }
    }

    fun handshot(target: Target): String {
        val damage = 20
        var probobility = 70-probobilityAll
        if (target.checkIsHit(probobility)) {
            return "\n Ура ты попал!${target.protAndHpTarget(damage)}"
        } else {
            return "\n Увы и ах ты не попал"
        }
    }

    fun homingmissile(target: Target): String {
        val damage = 10
        var probobility = 100
        if (target.checkIsHit(probobility))
        {return "\n Ракета попала!${target.protAndHpTarget(damage)}" }
        else
        {return "\n Ракета пролетела мимо цели"}
    }

    fun dableHandShot(target: Target):String{
        val damage = 40
        var probobility = 50-probobilityAll
        if (target.checkIsHit(probobility)){
            return "\n Да ты попал выстрел из 2 рук!${target.protAndHpTarget(damage)}"
        }
        else {
            return "\n Промах... Это не легко стрелять из 2 рук"
        }
    }

    fun punchHad(target: Target):String{
        val damage = 40
        var probobility = 65  -probobilityAll
        if (target.checkIsHit(probobility))
        { return "\n Ты что боксер? Отличный удар!${target.protAndHpTarget(damage)}"}
        else
        {return "\n Говорили тебе бокс отстой лучше бы стрелять учился!"}

    }

    fun hartShot(target: Target):String{
        val damage = 80
        var probobility = 25-probobilityAll
        if (target.checkIsHit(probobility))
        {return "\n Убойный грудак мужик!${target.protAndHpTarget(damage)}"}
        else
        {return "\n Выстрел из груди пролетел мимо... А чего ты ожидал???"}
    }

    fun lazer(target: Target):String{
        val damage = 15
        var probobility = 85-probobilityAll
        if (target.checkIsHit(probobility))
        {return "\n Да сожги их своим лазером!${target.protAndHpTarget(damage)}"}
        else
        {return "\n Странно как ты смог промохнуться???"}
    }

//    fun gan(){
//        val damag = 4165
//        xuyna().target(damag)
//    }


}
//class xuyna {
//    fun target(damage: Int){
//        var hp = 100
//
//        hp -= damage
//    }
//}




