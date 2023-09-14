package com.suvai.kotlin_practice

fun main() {
    printHelloWord()
    printSum(2, 3)
    printAreaOfCircle(2.5f)
    println(getFullName())

}

fun getFullName(): String {
    return "Vaibhav Kolte"
}

fun printAreaOfCircle(radius: Float): Unit { // Unit is similar to Java void
    println("Area ${Math.PI * radius * radius}")
}

fun printSum(a: Int, b: Int) {
    println("Sum = ${a + b}")
}

fun printHelloWord() {
    println("Hello Kotlin")
}

