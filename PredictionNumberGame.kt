package com.example.prednumgame

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    println("Welcome to the Number Prediction Game!")
    println("You have three chances to find the correct number that the computer has predicted. Good luck :)")
    val pred = Random.nextInt(0, 101);
    //println(pred)
    var live: Int = 3

    while (live > 0) {
        println("Pred:")
        val num = readLine()?.toInt()
        if (num == pred) {
            println("Congratulations... You did it!")
            exitProcess(0)

        } else {
            live -= 1
            if (live > 0) {
                println("Try again . you have  $live changess!!")
                if(num!! > pred){
                    println("Hint: You should try a smaller num ")
                }
                else{
                    println("Hint: You should try a higher num ")
                }
            } else {
                println("Hint: Game over. You ran out of lives.")
                exitProcess(0)
            }
        }

    }

}
