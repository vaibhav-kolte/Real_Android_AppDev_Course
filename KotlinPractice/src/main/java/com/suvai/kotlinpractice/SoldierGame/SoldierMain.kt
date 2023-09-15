package com.suvai.kotlinpractice.SoldierGame

fun main() {
    val soldier=Soldier()
    soldier.shoot()

    val specialForces = SpecialForces()
    specialForces.shoot()
    specialForces.sneakUpOnEnemy()

    val airForces = AirForces()
    airForces.shoot()
    airForces.jumpOurOfPlane()

    val sniper = Sniper()
    sniper.shoot()
    sniper.shoot()
    sniper.shoot()
    sniper.shoot()
    sniper.shoot()
    sniper.shoot()
    sniper.getIntoPosition()

}