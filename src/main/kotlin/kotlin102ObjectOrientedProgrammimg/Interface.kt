package kotlin102ObjectOrientedProgrammimg

interface Animal{
    // all these three functions must exist @ every [Animal]
    fun move(): String
    fun eat(): String
    fun breath(): String{
        return "yes" // <----this is called ["default implementation"] {this default implementation is optional, and it is basically writing the code here right away!}
    }
}
class Dog(): Animal {    // to inherit from "interface Animal"---> "must" override [move()] and [eat()]. However, overriding [breath()] is optional since we did "default implementation" to it earlier.
    override fun move(): String {
        return "Legs"
    }
    override fun eat(): String {
        return "steak"
    }
}
fun main() {
    val dog= Dog()   // INSTANCE FROM Dog()
    println(dog.breath())     // <------- [breach()] is possible without overriding anything,
    println(dog.eat())        // opposite to [breach()], [eat()][move()]-->must override.
    println(dog.move())
}