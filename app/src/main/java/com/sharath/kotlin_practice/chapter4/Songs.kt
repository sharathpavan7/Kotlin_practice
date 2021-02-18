package com.sharath.kotlin_practice.chapter4

class Songs(var title: String, var artist: String, val musicDir: String = "Thaman") {

    fun pay() = println("Playing the track: $title and artist: $artist")

    fun stop() = println("Track: $title stopped")

}

fun main(args: Array<String>) {
    val songOne = Songs("Song1", "Arjith")
    val songTwo = Songs("Song2", "Shreya Goshal")
    val songThree = Songs("Song3", "Honey singh")

    songOne.stop()
    songThree.pay()
    songThree.stop()

    println("Music directer of the song3: ${songThree.musicDir}")
}