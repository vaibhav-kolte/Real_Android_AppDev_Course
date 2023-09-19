package com.suvai.kotlinpractice.GameWithOOPS

class ShipYard {

    fun serviceShip(shipToServiced: Ship) {
        shipToServiced.serviceShip()
        println("Servicing :$shipToServiced")
    }

}