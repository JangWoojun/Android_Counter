package com.seogaemo.android_counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.number_text_view)
        val resetButton = findViewById<Button>(R.id.reset_button)
        val plusButton = findViewById<Button>(R.id.plus_button)

        numberTextView.text = number.toString()

        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
        }

        plusButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
        }
    }

}