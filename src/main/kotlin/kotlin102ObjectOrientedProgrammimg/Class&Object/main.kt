package kotlin102ObjectOrientedProgrammimg.`Class&Object`

//[second] is to create a variable, with the difference of AFTER EQUAL SIGN---> "Name of the class" that I want to take copy or instance.
// you can define more than ONE OBJECT to the same class

fun main() {
    var s1= Student()
    // you can define more than ONE OBJECT as variable to the same class
    var s2= Student()
//[third] define your object to be from that class and assign it values.
    s1.name = "Ahmed"
    s1.age=24
    s1.id=1123

    s1.hello()

}