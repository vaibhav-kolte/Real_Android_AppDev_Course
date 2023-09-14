package com.suvai.kotlin_practice.oops

class Soldier {

    // Variable
    var name = "George"
        private set // we can read it outside but can't change
    private val rank = "Marshall"
    private val hasWeapon = true
    var isMissing = true
    var bullets = 99
        get() {
            println("Getting bullets")
            return field
        }
        set(value) {
            field = if (value < 0) 0 else value
        }


    var bagPackWeight_KG = 70
    val weaponWeight_KG = 8
    var totalWeightSoldier = bagPackWeight_KG + weaponWeight_KG
        get() = bagPackWeight_KG + weaponWeight_KG

    fun getStatus() {
        var status = "$rank $name"
        status = if (isMissing) {
            "$status is missing"
        } else {
            "$status ready for duty"
        }
        println(status)
    }

    fun updateName(name:String){
        this.name = name
    }
}