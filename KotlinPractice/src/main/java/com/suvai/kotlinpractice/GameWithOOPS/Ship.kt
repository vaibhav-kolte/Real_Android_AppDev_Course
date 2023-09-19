package com.suvai.kotlinpractice.GameWithOOPS

abstract class Ship(
    val name: String,
    private var type: String,
    private val maxAttacks: Int,
    private val maxHullIntegrity: Int
) {
    private var destroyed = false
    private var hullIntegrity :Int =0
    protected var attacksRemaining:Int =0

    init{
        hullIntegrity = this.maxHullIntegrity
        attacksRemaining = 1
    }

    fun takeDamage(damageTaken:Int){
        if(!destroyed){
            hullIntegrity -= damageTaken
            println("$name damage taken = $damageTaken")
            println("$name ship integrity = $hullIntegrity")
            if (hullIntegrity <= 0) {
                println("Carrier $name has been destroyer(sunk)")
                destroyed = true
            }
        } else {
            // Already destroyed
            println("Ship does not exists.")
        }
    }

    fun serviceShip(){
        attacksRemaining = maxAttacks
        hullIntegrity = maxHullIntegrity
    }

    fun showStarts(){
        println("$type $name Attacks Remaining: $attacksRemaining \n" +
                "Hull: $hullIntegrity")
    }

    abstract fun attack():Int





}