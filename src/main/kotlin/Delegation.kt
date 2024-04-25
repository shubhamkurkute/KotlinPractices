interface Base{

    fun printMessage()
    fun printMessageLine()

}

class BaseImpl(val x:Int):Base{
    override fun printMessage() {
        println(x)
    }

    override fun printMessageLine() {
        println(x)
    }



}

class Derived (b:BaseImpl) : Base by b{



}

fun main(){
    val b = BaseImpl(10)
    Derived(b).printMessage()
    Derived(b).printMessageLine()
}