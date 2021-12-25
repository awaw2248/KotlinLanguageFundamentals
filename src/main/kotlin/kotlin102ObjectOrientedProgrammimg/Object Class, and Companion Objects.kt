package kotlin102ObjectOrientedProgrammimg

// [ OBJECT CLASS ]
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// 1- "Object Class" can Not have constructor -->{ () }
// 2- You can Not do instance from "Object Class" except One, and it happens at the start of the software.
//====================
//
//object Book{           //<----------[first]------------change class to object
//    val name: String = "Book Name"
//
//    fun printName() = println(name)
//}
//
//fun main() {
////$  val bookOne = Book()       //<------[second]-------- error @ this instance
////$    bookOne.name                    //<------[third]---------change 'bookOne' to 'Book'
//    Book.name
////$    bookOne.printName()             //<------[fourth]--------change 'bookOne' to 'Book'
//    Book.printName()
//}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//[ COMPANION OBJECT ]
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// {companion object} is the same as {object} but with small differences.
// One main difference is that {companion object} lives inside a class.
//==========
class SomeClass{

    fun printFromClass(){ println("hi from the class") }
    companion object{ fun create(): SomeClass = SomeClass() fun printLines(){ println("hi from the companion object") } }
}

fun main() {
    SomeClass.printLines()
    val object1 = SomeClass.create()

    object1.printFromClass()
}