package com.example.myfirstlab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById(R.id.textView) as TextView
        val Button = findViewById<Button>(R.id.button2)

        Button.setOnClickListener { }
        val numsEx = NumbersExercise()
        textView.setText(numsEx.numbers.joinToString())
        Button.setOnClickListener {
            textView.setText(numsEx.numbers.joinToString())
            val result1 = numsEx.firstNegative().toString()
            val result2 = numsEx.lastPositive().toString()
            val str = numsEx.numbers.joinToString() + "\n" + result1 + "-индекс первого отрицательного " + result2 + "-индекс последнего положительного"
            textView.setText(str)
        }
    }
    }




