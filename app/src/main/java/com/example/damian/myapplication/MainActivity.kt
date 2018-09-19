package com.example.damian.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.damian.myapplication.MESSAGE"

class MainActivity : AppCompatActivity() {

    var weightTotal = 45.0
    var started = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weightText.append("      ")

        button45.setOnClickListener({
            started = true
            weightTotal += 45*2
            weightText.append("+ 2(45) ")
            calculateWeight(weightTotal)
        })

        button35.setOnClickListener({
            started = true
            weightTotal += 35*2
            weightText.append("+ 2(35) ")
            calculateWeight(weightTotal)
        })

        button25.setOnClickListener({
            started = true
            weightTotal += 25*2
            weightText.append("+ 2(25) ")
            calculateWeight(weightTotal)
        })

        button10.setOnClickListener({
            started = true
            weightTotal += 10*2
            weightText.append("+ 2(10) ")
            calculateWeight(weightTotal)
        })

        button5.setOnClickListener({
            started = true
            weightTotal += 5*2
            weightText.append("+ 2(5) ")
            calculateWeight(weightTotal)
        })

        button2_5.setOnClickListener({
            started = true
            weightTotal += 2.5*2
            weightText.append("+ 2(2.5) ")
            calculateWeight(weightTotal)
        })

        button_calculate.setOnClickListener({
            if(started == true) {
//                weightText.append(" = " + weightTotal.toInt().toString())
                finalWeightText.text = weightTotal.toInt().toString()
                started = false
            }
            if(started == false && weightTotal == 45.0){
                Toast.makeText(this, "Please input a value to calculate.", Toast.LENGTH_LONG).show()
            }

        })

        button_clear.setOnClickListener({
            weightTotal = 45.0
            weightText.text = "      "
            finalWeightText.text = ""
        })
    }

    fun calculateWeight(weight: Double) {
        if(weight == 45.0) {
            Toast.makeText(this, "Please input a value to calculate.", Toast.LENGTH_LONG).show()
        }
        else {
            finalWeightText.text = weightTotal.toInt().toString()
            started = false
        }
    }
}
