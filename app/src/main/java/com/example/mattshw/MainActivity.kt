package com.example.mattshw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This Kaotlin Fl

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // User can tap a button to change the text color of the label.
            // 1. Add button to our layout.

        //Get a reference to button
            // 2. set up logic to know when user has tapped on the button

        findViewById<Button>(R.id.button).setOnClickListener {
            // Handles button tap
             // 2. Change color of text
           Log.i("Mathew", "Tapped on button")
            // Get a refrance to the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

    }
}