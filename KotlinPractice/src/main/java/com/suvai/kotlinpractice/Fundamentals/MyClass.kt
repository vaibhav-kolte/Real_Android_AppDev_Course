package com.suvai.kotlin_practice

fun main() {

    kotlinFundamental()
    kotlinDatatypeDeclaration()
    nullableTypeInKotlin()
    kotlinNullProblemSolution()
    kotlinElvisOperator()
    kotlinComment()
    ifCondition()
    whenCondition()
    whileDoWhileLoop()
    forLoop()

}

fun forLoop() {
    for (i in 'A'..'Z') print("$i ")
}

fun whileDoWhileLoop() {
    // print table of 5 using while loop
    var i = 1
    while (i <= 10) {
        println("2 * $i = ${2 * i}")
        i++
    }

    // do while loop
    i = 0
    do {
        println("Good Morning...")
        i++
    } while (i < 5)
}

fun whenCondition() {
    val rating: Int = 4

    val message = when (rating) {
        1 -> "BAD ! RATING = $rating stars"
        2 -> "NOT GOOD ! RATING = $rating stars"
        3 -> "NOT BAD ! RATING = $rating stars"
        4 -> "GOOD ! RATING = $rating stars"
        5 -> "Perfect !!! Rating = $rating starts"
        else -> "Nothing"
    }

    println(message)

}

fun ifCondition() {
    println("\n\n\nTime")
    val time = 10
    val isAMOrPM = if (time < 12) {
        "am"
    } else {
        "pm"
    }
    println(isAMOrPM)


    val weight = 50
    val myInstruction = "Put bag in ${if (weight < 50) "hold" else "cabin"}"
    println(myInstruction)

    val isComingOverBridge = false
    var shootThem: Boolean
    var holdPosition: Boolean
    var blowTheBridge: Boolean

    val wavingWhiteFlag = true

    var friendlySoldiers = 2000
    var enemySoldiers = 3000

    if (wavingWhiteFlag) {
        if (isComingOverBridge && friendlySoldiers > enemySoldiers) {
            shootThem = true
        } else if (isComingOverBridge && friendlySoldiers < enemySoldiers) {
            blowTheBridge = true
        } else {
            shootThem = false
            holdPosition = true
        }
    }
}


fun kotlinComment() {
    // This is single line comment

    /*
    This is multi-line
    comment
     */
}

fun kotlinElvisOperator() {
    print("My name is ${getMyName()}")

}

fun getMyName(): String {
    var name: String? = "Vaibhav"

//    if(name != null){
//        return name
//    }else{
//        return "Android Studio"
//    }


    name = null

    if (name != null) {
        return name
    } else {
        return "Android Studio"
    }


//    return name ?: "Android Studio"
}

fun kotlinNullProblemSolution() {
    val myName: String? = null

    val uppercaseMyName = myName?.uppercase()
//    val upperCase = myName!!.uppercase() // Exception

//    if(myName != null){
//        val uppercaseMyName = myName.uppercase()
//    }
    println("My Name $uppercaseMyName")

    val firstNumber = 10
    val secondNumber = 20
    val result = firstNumber.times(secondNumber)

    println("First Method $result")

    val firstNumber1 = 10
    val secondNumber1: Int? = 20
    if (secondNumber1 != null) {
        val result1 = firstNumber1.times(secondNumber1)
        println("Second Method $result1")
    }


}

fun nullableTypeInKotlin() {
//    val userName: String = null // Error

    val userName: String? = null
    if (userName != null) {
        val firstName = "Vaibhav"
    }
}

fun kotlinDatatypeDeclaration() {
    var myExample = "My little string"
    myExample = myExample.uppercase()
    println(myExample)

    val userCount: Int = 10
    val name = "Vaibhav" // STRING
    val amount = 2.343 // DOUBLE
}

fun kotlinFundamental() {
    println("Hello")

    val yearOfBirth = 1996  // Immutable
    val pi = 83.14f         // Immutable
    var currentYear = 2024     // Mutable
    var isItRaining = false     // Mutable


    // TODO var variable can be reassign
    currentYear = 2023
    isItRaining = true


    var ourProgrammingLanguage: String = "Kotlin"

//    ourProgrammingLanguage = 11 // Error

    // Assignment operator =
    var greeting = "Hello"

    // Addition operator +
    var val1 = 10f
    var val2 = 20
    var addition = val1 + val2
    println(addition)


    // Subtraction operator
    var myAge = currentYear - yearOfBirth
    println("My age $myAge")

    // Division operator
    val div = val1 / val2
    println("Division $div")


    // Multiplication operator
    val multi = val1 * val2
    println("Multiplication $multi")


    // Increment operator ++

    val myAgeInNextYear = ++myAge // Pre-Increment first increment then assign
    // myAge++ post-increment first assign then increment
    println("My age in next year $myAgeInNextYear")

    myAge--

    // Decrement operator --
    val myAgeInPreviousYear = --myAge // Pre-Decrement first decrement then assign
    // myAge-- post-decrement first assign then decrement
    println("My age in previous year $myAgeInPreviousYear")
}
