package com.suvai.kotlin_practice.GameWithOOPS

fun main() {
    val friendlyDestroyer = Destroyer("Tsunami")
    var friendlyCarrier = Carrier("Flooder")

    val enemyDestroyer = Destroyer("Kotliner")
    val enemyCarrier = Carrier("Winsen")

    var friendlyShipYard = ShipYard()

    // Start war
    friendlyDestroyer.takeDamage(enemyDestroyer.shootShell())
    friendlyDestroyer.takeDamage(enemyCarrier.launchAerialAttack())

    // Fight back
    enemyCarrier.takeDamage(friendlyCarrier.launchAerialAttack())
    enemyCarrier.takeDamage(friendlyDestroyer.shootShell())

    // Take stock of supplier situation
    println("${friendlyDestroyer.name} amno = ${friendlyDestroyer.amno}")
    println("${friendlyCarrier.name} amno = ${friendlyCarrier.attacksRemaining}")

    // End the battle by attacking enemy
    enemyDestroyer.takeDamage(friendlyCarrier.launchAerialAttack())
    enemyDestroyer.takeDamage(friendlyDestroyer.shootShell())
    enemyDestroyer.takeDamage(friendlyDestroyer.shootShell())

    // Go to the shipyard
    friendlyShipYard.serviceDestroyer(friendlyDestroyer)
    friendlyShipYard.serviceCarrier(friendlyCarrier)
}