package kotlin102ObjectOrientedProgrammimg

// DATA CLASS
////-----------------------------------------------------------------------------------------------------------------------------------
// class Student(val name: String, var age:Int)
////third] a way to solve this issue is to override toString function
//{   // However, this way is complicated and need a lot of modification.
//    // ----------------> here it comes the use of WORD: [DATA] before class
//    override fun toString(): String {
//        return this.name
//    }
// }
//
//
//fun main(){
//    val studentOne = Student("Ahmed", 20)
//    val studentTwo = Student("Ahmed", 20)
//
//    //[second] adding this printing line would result in printing something un-wanted --> which is why { Not Equal} get printed.
//    println(studentOne)
//    println(studentTwo)
//
//    //[first] a "run" to this condition will result printing the string {Not Equal} even though they are equal!
//
//if (studentOne == studentTwo){
//    println("Equal")
//}else{
//    println("Not Equal")
//}
//}
//============

// data class Student(val name: String, var age:Int)
////third] a way to solve this issue is to override toString function
//   // However, this way is complicated and need a lot of modification.
//    // ----------------> here it comes the use of WORD: [DATA] before class
//      // which will print the two properties "student's name" and "student's age"
//       // and it will check for condition requirement
//         // a correct printing would happen
//fun main(){
//    val studentOne = Student("Ahmed", 20)
//    val studentTwo = Student("Ahmed", 20)
//
//    //[second] adding this printing line would result in printing something un-wanted --> which is why { Not Equal} get printed.
//    println(studentOne)
//    println(studentTwo)
//
//    //[first] a "run" to this condition will result printing the string {Not Equal} even though they are equal!
//
//if (studentOne == studentTwo){
//    println("Equal")
//}else{
//    println("Not Equal")
//}
//}
//-----------------------------------------------------------------------------------------------------------------------------------------
// ENUM CLASS
//-----------------------------------------------------------------------------------------------------------------------------------------
// enum class -> is a type of class within kotlin programming language as well as many other programming languages like: Java, C++
// enum class benefit -> increase the visibility and type safety.
//                    -> By: limiting the possibility of values for specific variables.
//===========================================================================================================
//enum class Directions{
//               // all are CAPITAL--- the "conventions" way to write them! best practices.
//    NORTH,
//    SOUTH,
//    EAST,
//    WEST
//}
//
//fun main() {
//    val carDirection = Directions.NORTH
//    println(carDirection) // it will print= "NORTH"
//}
//---------------------------------------------------------------------------------------------------------------------------------------------------------
//// notes:
//// One of the most important types of classes in Kotlin programming language is Data Class.
//// Data Class is the same normal class except ready functions of the following: [toString], [equals], [hashCode], [copy].
//// Data Class must have 'primary constructor'
//// Data Class is very useful in "comparison" between "instances"
//
//// ex:
//data class Student(val name: String) // This LINE has generated-----> [toString], [equals], [hashCode], [copy], [[getters]], [[setters]].
//
//fun main() {
//    val student1 = Student("Ahmed")
//    val student2 = Student("Ahmed")
//    // some information
//    // in this case, a comparison between names
//    if (student1 == student2){    //<------- it uses {.equals()}
//        println("Equal")
//    }
//}
//// prints
////Equal
//-------------------------------------------------------------------------------------------------------------------------
