package com.sharath.kotlin_practice.chapter5
/*Animal super class
* will be inherited by other classes which represent animal*/
open class Animal {

    open val image = ""
    open val habitat = ""
    open val food = ""
    var hunger = 10

    open fun makeNoise() {
        println("Animal making noise")
    }

    open fun eat() {
        println("Animal is eating")
    }

    open fun roam() {
        println("Animal is roaming")
    }

    fun sleep() {
        println("Animal is sleeping")
    }
}