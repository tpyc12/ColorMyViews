package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var boxOne: TextView
    private lateinit var boxTwo: TextView
    private lateinit var boxThree: TextView
    private lateinit var boxFour: TextView
    private lateinit var boxFive: TextView
    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var buttonRed: Button
    private lateinit var buttonYellow: Button
    private lateinit var buttonGreen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxOne = findViewById(R.id.boxOne)
        boxTwo = findViewById(R.id.boxTwo)
        boxThree = findViewById(R.id.boxThree)
        boxFour = findViewById(R.id.boxFour)
        boxFive = findViewById(R.id.boxFive)
        constraintLayout = findViewById(R.id.constraintLayout)
        buttonRed = findViewById(R.id.buttonRed)
        buttonYellow = findViewById(R.id.buttonYellow)
        buttonGreen = findViewById(R.id.buttonGreen)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                boxOne, boxTwo, boxThree, boxFour, boxFive, constraintLayout,
                buttonRed, buttonYellow, buttonGreen
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColor(it) }
        }
    }

    private fun makeColor(view: View) {
        when (view.id) {
            R.id.boxOne -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwo -> view.setBackgroundColor(Color.GRAY)
            R.id.boxThree -> view.setBackgroundColor(Color.RED)
            R.id.boxFour -> view.setBackgroundColor(Color.GREEN)
            R.id.boxFive -> view.setBackgroundColor(Color.YELLOW)

            R.id.buttonRed -> boxThree.setBackgroundResource(R.color.red)
            R.id.buttonYellow -> boxFour.setBackgroundResource(R.color.yellow)
            R.id.buttonGreen -> boxFive.setBackgroundResource(R.color.green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}