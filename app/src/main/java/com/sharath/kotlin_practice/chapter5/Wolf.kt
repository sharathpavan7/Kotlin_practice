package com.sharath.kotlin_practice.chapter5

class Wolf: Canine() {

    override val image = "Wolf.jpg"
    override val habitat = "forest"
    override val food = "meat"

    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}