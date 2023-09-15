package com.suvai.kotlinpractice.Fundamentals

fun main() {
    println(getSum(4, 5))
    println(calculatedCTC(ctc = 300000, hike = 50))
    println(calculatedCTC(ctc = 400000))
    println(calculatedCTC(ctc = 700000))
}

fun calculatedCTC(ctc: Int, hike: Int = 30): Int {
    return ctc + (ctc * hike / 100)

}

fun getSum(a: Int, b: Int) = a + b