package com.sharath.kotlin_practice.chapter3

import kotlin.random.Random

/*
* Rock Paper Scissors game
*/

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    println(gameChoice)
}

private fun getGameChoice(optionParams: Array<String>) = optionParams[Random.nextInt(0, optionParams.size)]