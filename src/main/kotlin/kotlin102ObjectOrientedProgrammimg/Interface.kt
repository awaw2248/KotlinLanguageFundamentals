package kotlin102ObjectOrientedProgrammimg

interface Animal{

    fun move()
    fun eat()

    fun breath(): Boolean{
        return true
    }

}
class Dog(): Animal{
    override fun move() {
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

}
