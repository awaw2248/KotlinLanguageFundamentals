//functions - Functions
//---------------------------------------------------------------------------------------------------------------------------------------
// "fun" is the key world within kotlin language to declare a function, then name of that function.
// Naming functions is the same as Naming variables.
// However, 1- can Not use a world that is built-in within kotlin language.
//          2- if the function name is about two words, can Not use space between them.
//          3- can not start the naming with a number.
fun main() {
  sum()
}
fun sum (){
    var num1 = 2
    var num2 = 4
    println(num1+num2)      // this line will not get executed because you need to call [sum] function inside the MAIN function
}
//---------------------------------------------------------------------------------------------------------------------------------------
//Parameters & Arguments - Functions
//---------------------------------------------------------------------------------------------------------------------------------------
