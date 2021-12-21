package kotlin102ObjectOrientedProgrammimg.classes.objects

//"creating an object is the same way of creating a variable" the [first] step is to create a class that hold all variables as objects.
//AFTER EQUAL SIGN of the object---> "Name of the class" that I want to take copy or instance.
// you can define more than ONE OBJECT ex: (s1,s2,...) to the same class "student"

fun main() {
    var s1= Student()
    // you can define more than ONE OBJECT as variable to the same class
    var s2= Student()
//[third] define your object to be from that class and assign it values.
    s1.name = "Ahmed"
    s1.age=24
    s1.id=1123
// to access the "function hello" that is @ the "student class"-----> use (dot)
    s1.hello()

}