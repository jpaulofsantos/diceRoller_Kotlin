package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollDice()

    }

    fun rollDice() {
        val button: Button = findViewById(R.id.button)
        val image: ImageView = findViewById(R.id.imageView)
        val image2: ImageView = findViewById(R.id.imageView2)
        //val textDice: TextView = findViewById(R.id.textViewDice)
        // val textDice2: TextView = findViewById(R.id.textView2)

        button.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            var numero = (1..6).random()
            var numero2 = (1..6).random()
            //textDice.text = numero.toString()
            // textDice2.text = numero2.toString()

            when (numero) {
                1 -> image.setImageResource(R.drawable.dice_1)
                2 -> image.setImageResource(R.drawable.dice_2)
                3 -> image.setImageResource(R.drawable.dice_3)
                4 -> image.setImageResource(R.drawable.dice_4)
                5 -> image.setImageResource(R.drawable.dice_5)
                6 -> image.setImageResource(R.drawable.dice_6)
            }

            when (numero2) {
                1 -> image2.setImageResource(R.drawable.dice_1)
                2 -> image2.setImageResource(R.drawable.dice_2)
                3 -> image2.setImageResource(R.drawable.dice_3)
                4 -> image2.setImageResource(R.drawable.dice_4)
                5 -> image2.setImageResource(R.drawable.dice_5)
                6 -> image2.setImageResource(R.drawable.dice_6)
            }

            if (numero == 2 || numero2 == 2) Toast.makeText(this, "LUCKY NUMBER!", Toast.LENGTH_SHORT).show()

        }
    }
}