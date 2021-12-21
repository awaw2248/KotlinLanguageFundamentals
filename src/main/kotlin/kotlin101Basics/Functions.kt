package kotlin101Basics//functions - Functions
//---------------------------------------------------------------------------------------------------------------------------------------
// "fun" is the key world within kotlin language to declare a function, then name of that function.
// Naming functions is the same as Naming variables.
// However, 1- can Not use a world that is built-in within kotlin language.
//          2- if the function name is about two words, can Not use space between them.
//          3- can not start the naming with a number.
//fun main() {
//  sum()
//}
//fun sum (){
//    var num1 = 2
//    var num2 = 4
//    println(num1+num2)      // this line will not get executed because you need to call [sum] function inside the MAIN function
//}
//---------------------------------------------------------------------------------------------------------------------------------------
//Parameters & Arguments - Functions
//---------------------------------------------------------------------------------------------------------------------------------------
//fun main() {
//    sum(3,5)                          //[second] calling the function and passing two inputs.
//    sum(2,9)                          //[third] you can call the function MORE THAN ONCE, and passing different input values
//}
//fun sum(num1:Int,num2:Int){           //[first] saying that this function is accepting two inputs, these are with Integer types. AND printing the sum of inputs
//    println(num1+num2)
//}
//---------------------------------------------------------------------------------------------------------------------------------------
//"Return" Values From Functions - Functions
//---------------------------------------------------------------------------------------------------------------------------------------
//fun main() {
//var result = sum(2,4)/2          //declaring a variable and [third!] set its value to the output of (sum) function. Performing other operation to function output value is possible, ex: divide by 2
//    println(result)                          //[fourth] printing the value of that variable
//}
//fun sum(num1:Int,num2:Int) : Int{            //[second] must declare type of return after constructor by (:) then data type, which is (Int)
//    return(num1+num2)                        //[first] to return the values after the sum operation without printing it. use the keyword "return"
//}