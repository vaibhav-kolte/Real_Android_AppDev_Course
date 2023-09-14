package com.suvai.kotlin_practice.GameWithOOPS

class Destroyer(name: String) {
    var name: String = ""
        private set
    val type = "Destroyer"

    // ship hp
    private var hullIntegrity = 200

    // how many amno left
    var amno = 1

    // no external access
    private var shortPower = 60

    // is ship destroyed or not?
    private var destroyed = false

    init {
        this.name = "$type $name"
    }

    fun takeDamage(damageTaken: Int) {
        if (!destroyed) {
            hullIntegrity -= damageTaken
            println("$name damage taken = $damageTaken")
            println("$name ship integrity = $hullIntegrity")
            if (hullIntegrity <= 0) {
                println("Destroyer $name has been destroyer(sunk)")
                destroyed = true
            }
        } else {
            // Already destroyed
            println("Ship does not exists.")
        }
    }

    fun shootShell(): Int {
        return if (amno > 0) {
            amno--
            shortPower
        } else {
            0
        }
    }

    fun repairShip(){
        amno = 10
        hullIntegrity = 100
    }
}