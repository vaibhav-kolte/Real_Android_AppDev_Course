package com.suvai.kotlinpractice.GameWithOOPS

class Destroyer(name: String) : Ship(name, "Destroyer", 10, 200) {

    // no external access
    private var shortPower = 60


    override fun attack(): Int {
        return if (attacksRemaining > 0) {
            attacksRemaining--
            shortPower
        } else {
            0
        }
    }
}