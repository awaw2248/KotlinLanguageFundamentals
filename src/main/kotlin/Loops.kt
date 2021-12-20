//Loops
//-------------------------------------------------------------------------------------------
//For Loop - Loops
//-------------------------------------------------------------------------------------------
//fun main() {
//    for(index in 1..10)          // you can say "a" or "b" or "index"
//        println(index)           // increasing
//
//    for (index in 10 downTo 1)    // decreasing
//        println(index)
//}
//                     //** this is how to "RANG" with For Loop
//                     //** index is a variable which its value would change at every round
//                     //** ex: @ first round, index value was 1, then got printed, then exited round,
//                     //**     then enter the second round, and its value become 2.....so on!
//                     //**SO -> : [Every round, index value "changes" and "get printed"]
//-------------------------------------------------------------------------------------------
//While Loop ["break", and "continue"] - Loops
//-------------------------------------------------------------------------------------------
fun main() {
    for (index in 1..10){                   //** This (for loop) is about to check index's value @ every round! whether index value is ODD or EVEN number value
        if (index % 2 == 0){                //** if index value is odd, the println statement gets printed.
              continue                      //** printing happen for all numbers value
        }
        println("$index is odd")
    }
}


//-------------------------------------------------------------------------------------------
//Do..While - Loops
//-------------------------------------------------------------------------------------------

