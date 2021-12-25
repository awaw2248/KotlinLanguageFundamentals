package kotlin102ObjectOrientedProgrammimg
//
//fun main() {
//    var s1= Students("Ahmed Al Hassan", 25, 123456789, 4.5)
//    s1.info()
//
//
//    var s2= Teachers("Muhammad", 30,987654321,90.000)
//    s2.info()
//}
//
//open class Users(var name: String, var age: Int, var id: Int){      // declaring variables @ "parent class" [for repeated variable]
//fun info(){
//    println("the ID for your job is : $id")
//}
//}
//
//class Students( name: String,  age: Int,  id: Int, var GPA: Double) : Users(name, age, id){        // declaring types only @ child class [for repeated variable]
//
//}
//class Teachers( name: String,  age: Int, id: Int, var Salary: Double): Users(name, age, id){       // declaring types only @ child class [for repeated variable]
//
//}
//======================================================================================================================

//fun main() {
//    var s1= Students("Ahmed","petroleum engineering", 7755, 100.00)
//    s1.result()
//}
//
//
//  open class School(var name: String, var numberID: Int, var grade: Double){
//      fun result() {
//          println("official statement is $name, $numberID, $grade")
//      }
//   }
//
//   class Students( name: String, var major: String,  numberID: Int,  grade: Double): School(name,numberID,grade) {
//
//    }
//    class Teachers( name: String, var collage: String, numberID: Int, grade: Double){
//
//    }
//
