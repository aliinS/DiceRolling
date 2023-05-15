package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    /* let's leave it here to remind the basics on HOW TO MAKE RANDOM NUMBERS
    //that below is actually val diceRange: IntRange = 1..6, just shortened, because
    //the language will recognize it i an intRange(starting number
    //separated by two dots from the ending number of the range, no spaces!)
    val diceRange = 1..6

    //using a random() function to generate a random number from the diceRange
    //variable and storing it in a new variable called randomNumber
    val randomNumber = diceRange.random()
    //to make it more shorter, I could simplify it like this:
    //val randomNumber = (1..6).random()

    println("Random number is $randomNumber")
     */

    val myFirstDice = Dice()
    val mySecondDice = Dice()
    // println(myFirstDice.sides)
    // println(mySecondDice.sides)
    //1 myFirstDice.roll() -> outputs a random number from 1 to 6
    //1 mySecondDice.roll()

    // now two players are playing.(create second dice). I need the roll function to return something,
    // not just println.
    val diceRoll = myFirstDice.roll()
    val diceRoll2 = mySecondDice.roll()
    // now to see what the diceRoll has returned:
    //({} is used after $, when there are multiple words. With one-worded, I skip the curly brackets)
    println("Player1 ${myFirstDice.sides}-sided dice rolled $diceRoll,")
    println("Player2 ${mySecondDice.sides}-sided dice rolled $diceRoll2.")
}

//all class names are written UpperCamelCase!
class Dice {
    var sides = 6

    //function names are written in lowerCamelCase!
    //fun defined inside a class can also be called  method.
    // to return something, I need to specify the data type that it will be returning.
    // in this case, integer. SO, after fun name() add :(space)type(space)
    fun roll(): Int {
        val randomNumber = (1..6).random() //!when inlined, makes it a "return (1..6).random()"
        //1 println(randomNumber) //does not print anything here.
        //it needs to be called out in the main function.

        //return a random number, which is an int.
        return randomNumber

    //!! when I am playing with dice(s) that have for example 12 sides, then modify like this:
    // val randomNumber = (1..sides).random() <- sides is var, so i can change its value; and ending the range
    // with "sides" can ensure that sides and max random number is a match.
        // in the main function I have to specify that myFirstDice.sides = 12 before the diceRoll
    }
}

