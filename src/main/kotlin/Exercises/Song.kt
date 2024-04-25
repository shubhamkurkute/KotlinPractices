package Exercises

class Song (val title: String,val artist: String,val year:Int,val playCount:Int){

    val isPopular:Boolean
        get() = playCount>=1000

    fun songDescription(){
        println("$title, performed by $artist, was released in $year")
    }
}

fun main(){
    val song = Song("Ha chandra tuzyasathi","Swapnil Bandodkar",2004,100000)
    song.songDescription()
    println(song.isPopular)
}