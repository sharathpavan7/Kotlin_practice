package com.sharath.kotlin_practice.chapter2

import kotlin.random.Random

fun main(args: Array<String>) {
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val array1Size = wordArray1.size
    val array2Size = wordArray2.size
    val array3Size = wordArray3.size

//    val rand1 = (Math.random() * array1Size).toInt()
    val rand1 = Random.nextInt(0, wordArray1.size)
//    val rand2 = (Math.random() * array2Size).toInt()
    val rand2 = Random.nextInt(0, wordArray2.size)
//    val rand3 = (Math.random() * array3Size).toInt()
    val rand3 = Random.nextInt(0, wordArray3.size)

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(phrase)


    val intArray = arrayOf(1, 2, 3.5)
    for (int in intArray) {
        println(int)
    }
}