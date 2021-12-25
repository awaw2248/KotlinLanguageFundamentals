package kotlin102ObjectOrientedProgrammimg

//// Nested Classes
////--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//// Nested Classes  ----> "class inside class"------------>      class OUTER_class{ class Nested_class{} }
////--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//fun main() {
//    // to make object of the inside "nested" class, must write the name of the outer class first, then inside-nested class, then 'variables or functions'.
//    var s1=School.Student().student()
//    // so, you cannot access inside class unless to you access outer class first.
//}
//
//class School{
//    fun school(){
//        println("School: Outer class")
//    }
//    class Student{            //<----- THIS INSIDE "NESTED" CLASS can NOT access variables nor functions of the OUTER class
//        fun student(){
//            println("Student: Nested class")
//        }
//    }
//}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Inner Classes
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// notes:
// 1- Since the inside class cannot access 'variables or functions' of the outer class, the answer will be inner classes
// 2- Inner Class is way to make inside class access 'variables and functions' of the outer class.
// 3- By: ----->   writing the keyWord "inner" before the Nested Class.
// 4- now you can access the outer class.
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//fun main() {
//var s1= School().Student().student()   //  <--[third]-- making object of the nested class by writing:
//                                        //  name of outer class then name of inside nested class-----> to call the function "student()" that is located in the inside nested class
//}
//class School{
//    var school = "School: Outer class"   // <-- variable created in the outer-class [first]
//    fun school(){
//        println("School: Outer class")
//    }
//    inner class Student{
//        fun student(){
//            println("Student: Nested class, $school")  //  [second] variable access in the nested-class by keyword: "inner"
//        }
//    }
//}
////==========================
//// printing : ---> what's inside the inside class and accessed something from the outer class.
//// this is how to access variables in the outer class.
//// for the nested class to access something @ the outer class, we use the keyword [inner]
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
