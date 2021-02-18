package com.sharath.kotlin_practice.chapter3

import kotlin.random.Random

/*
* Rock Paper Scissors game
*/

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    //println(gameChoice)
    val userChoice = getUserChoice(options)

    // showing final result
    showFinalResult(userChoice, gameChoice)
}

private fun getGameChoice(optionParams: Array<String>) = optionParams[Random.nextInt(0, optionParams.size)]

private fun getUserChoice(optionParams: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    // looping untill the user enters a valid option
    while (!isValidChoice) {
        // ask the user for their choice
        print("Please enter one of the following:")
        for (option in optionParams) print(" $option")
        println(".")

        var userInput = readLine()
        userInput = userInput?.capitalize()
        // user has entered a valid option
        if (userInput != null && userInput in optionParams) {
            isValidChoice = true
            userChoice = userInput
        }

        // user entered a invalide input
        if (!isValidChoice) println("You have entered an invalid option.")
    }
    return userChoice
}

private fun showFinalResult(userChoice: String, gameChoice: String) {

    val result: String
    // figurout the result
    if (userChoice.equals(gameChoice, true)) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You won"
    else result = "You lost"

    // showing final result
    println("Your choice: $userChoice, game choice: $gameChoice. $result")
}