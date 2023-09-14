package com.suvai.kotlin_practice.oops


fun main() {
    // Kotlin oops
//    Objects
//    Class
//    Inheritance
//    Polymorphism
//    Abstraction
//    Encapsulation

    val soldier = Soldier()
    soldier.getStatus()
    soldier.isMissing = false
    soldier.getStatus()

    println("Bullets ${soldier.bullets}")
    soldier.bullets = -11
    println("Bullets ${soldier.bullets}")

    println("Total weight soldier = ${soldier.totalWeightSoldier}")

    soldier.bagPackWeight_KG = 40

    println("Total weight soldier = ${soldier.totalWeightSoldier}")


    println("Name = ${soldier.name}")
    soldier.updateName("Vaibhav")
    println("Name = ${soldier.name}")



    // Constructor
    val kotlinBook = Book("Kotlin Programming",430)


    val javaCourse = OnlineCourse("Java Network programming","Vaibhav") // used primary constructor
    val carRepairCourse = OnlineCourse("Basic car machine training","Kolte","Auto mechanic") // used secondary constructor
}