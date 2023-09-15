package com.suvai.kotlinpractice.GameWithOOPS

class Carrier(name: String) {
    var name: String = ""
        private set
    val type = "Carrier 'Aircraft'"

    private var hullIntegrity = 100

    var attacksRemaining = 1
        private set
    private var attackPower = 120

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
                println("Carrier $name has been destroyer(sunk)")
                destroyed = true
            }
        } else {
            println("Ship does not exists.")
        }
    }


    fun launchAerialAttack(): Int {
        return if (attacksRemaining > 0) {
            attacksRemaining--
            attackPower
        } else {
            0
        }
    }

    fun repairShip() {
        attacksRemaining = 20
        hullIntegrity = 200
    }
}