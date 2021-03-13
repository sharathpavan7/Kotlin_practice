package com.sharath.kotlin_practice.chapter5

class Vet {

    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }

}

fun main(args: Array<String>) {
    val animals = arrayOf(Wolf(), Hippo())

    // calling roam() & eat () of each animal form "animals" array
    for (animal in animals) {
        animal.roam()
        animal.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}