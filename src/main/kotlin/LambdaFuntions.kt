fun main(){
    val coins:(Int)->String = {
        "$it Quarters"
    }

    val cupCakes:(Int)->String={
        "Have a cup cake"
    }
    val treatFunction = trickOrTreat(false) { "$it Quarters" }
    val trickFunction = trickOrTreat(true,null)
    repeat(4){
        treatFunction()
    }
    treatFunction()
    trickFunction()

}

// BELOW FUNCTION RETURNS A  LAMBDA FUNCTION AND THAT LAMBDA FUNCTION RETURNS NOTHING SO UNIT.
fun trickOrTreat(isTrick:Boolean, extraTreat: ((Int) -> String)?):()->Unit{
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }


}

var trick = {
    println("Trick or Treat")

}

var treat :()->Unit = {
    println("Have a Treat")

}

