package com.sharath.kotlin_practice.chapter5

class Hippo: Animal() {

    override val image = "Hippo.jpg"
    override val habitat = "Water"
    override val food = "Grass"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("Hippo eating $food")
    }
}