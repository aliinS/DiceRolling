package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT)
            toast.show()

            val resultTextView: TextView = findViewById(R.id.dice_number)
            fun rollDice() {
                val dice = Dice(6)
                val diceRoll = dice.roll()
                resultTextView.text = diceRoll.toString()
            }
            rollDice()
        }
    }
}

//all class names are written UpperCamelCase!
class Dice(private val diceSides: Int) {

    //function names are written in lowerCamelCase!
    //fun defined inside a class can also be called  method.
    // to return something, I need to specify the data type that it will be returning.
    // in this case, integer. SO, after fun name() add :(space)type(space)
    fun roll(): Int {
        val randomNumber = (1..diceSides).random() //!when inlined, makes it a "return (1..6).random()", but I am gonna keep it like this ->easier to understand at this point.
        // println(randomNumber) //does not print anything here.
        //it needs to be called out in the MainActivity.

        //return a random number, which is an int.
        return randomNumber
    }
}

