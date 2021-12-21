package kotlin102ObjectOrientedProgrammimg.classes

//everything @ ONE PAGE
//----------------------------------------------------------------------------------------------------------------------
//creating a class with objects
//----------------------------------------------------------------------------------------------------------------------
//fun main() {
//      var s1 = Student()
//      var s2 = Student()
//
//    s1.name = "Ahmed"
//    s1.age = 0
//    s1.id = 0
//    s1.say_Hello()
//}
//class Student{
//    var id : Int=0
//    var name : String = ""
//    var age: Int = 0
//
//
//    fun say_Hello(){
//        println("Hello")
//    }
// }
//----------------------------------------------------------------------------------------------------------------------
//passing value to class - parameter
//----------------------------------------------------------------------------------------------------------------------
//fun main() {
//   var s1 =Student("Ahmed", 123455,19)
//
//    println(s1.name)
//    println(s1.age)
//    println(s1.id)
//    println(s1.hello())
//}
//class Student(name:String, id: Int, age: Int){
//    var id: Int = id
//    var name: String = name
//    var age: Int = age
//
//    fun hello(){
//        println("Hello Ahmed")
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//   initialization - classes
//----------------------------------------------------------------------------------------------------------------------
fun main() {
 var s1 = Students("Ahmed", 1234, 25)
}
class Students(var name: String, var id: Int, var age: Int){

    init {
        println("Hello Muhammad")
    }
}