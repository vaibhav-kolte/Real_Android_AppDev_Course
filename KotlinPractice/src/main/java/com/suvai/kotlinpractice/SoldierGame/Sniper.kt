package com.suvai.kotlinpractice.SoldierGame

class Sniper : Soldier() {

    var sniperAmmo = 5
    override fun shoot() {

        when (sniperAmmo > 0) {
            true -> {
                println("Check for wind.. hold breath.. BANG!! ammo = $sniperAmmo")
                sniperAmmo--
            }

            false -> {
                super.shoot()
            }
        }
//        println("Check for wind.. hold breath.. BANG!!")
    }

    fun getIntoPosition() {
        println("Seach for good shooting vision...")
    }
}