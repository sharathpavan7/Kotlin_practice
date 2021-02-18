package com.sharath.kotlin_practice.chapter4

class Dog(val name: String, weightParam: Int, breedParam: String) {

    init {
        println("Dog $name has been created.")
    }

    // things dog can do.
    var activities = arrayOf("Walking")

    val breed = breedParam.toUpperCase()

    init {
        println("The breed is $breed")
    }

    var weight = weightParam
        set(value) {
            if (value > 0) field = value
        }

    var weightInKgs: Double = 0.0
        get() = weight/2.2

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>) {

    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in kgs: ${myDog.weightInKgs}")
    myDog.weightInKgs = 102.5
    println("Weight in kgs: ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight : ${myDog.weight}")

    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities)  println("My dog enjoys $item")

    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}