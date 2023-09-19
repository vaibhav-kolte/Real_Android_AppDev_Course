package com.suvai.kotlinpractice.GameWithOOPS

fun main() {
    val friendlyDestroyer = Destroyer("Tsunami")
    var friendlyCarrier = Carrier("Flooder")

    val enemyDestroyer = Destroyer("Kotliner")
    val enemyCarrier = Carrier("Winsen")

    var friendlyShipYard = ShipYard()

    // Small Battle
    friendlyDestroyer.takeDamage(enemyDestroyer.attack())
    friendlyDestroyer.takeDamage(enemyCarrier.attack())
    enemyCarrier.takeDamage(friendlyCarrier.attack())
    enemyCarrier.takeDamage(friendlyDestroyer.attack())

    friendlyDestroyer.showStarts()
    friendlyCarrier.showStarts()

    friendlyDestroyer.serviceShip()
    friendlyCarrier.serviceShip()

    // Finish the enemy!!!
    enemyDestroyer.takeDamage(friendlyDestroyer.attack())
    enemyDestroyer.takeDamage(friendlyCarrier.attack())
    enemyDestroyer.takeDamage(friendlyDestroyer.attack())
}