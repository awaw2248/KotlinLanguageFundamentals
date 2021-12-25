package kotlin102ObjectOrientedProgrammimg

interface Animal{

    fun move(): String
    fun eat(): String

    fun breath(): String{
        return "yes"
    }

}
class Dog(): Animal {
    override fun move(): String {
        return "Legs"
    }

    override fun eat(): String {
        return "steak"
    }
}

fun main() {
    val dog= Dog()
    println(dog.breath())     // doing an instance from [breach()] is possible without overriding anything, opposite to the other functions, [eat()][move()]
    println(dog.eat())
    println(dog.move())
}