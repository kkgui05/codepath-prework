package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// THis Kotlin file is where we're going to be handling user interaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from {name}'
        // User can tap a button to change the text color of the label.
        // 1. Add a button to our layout

        // Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {  }
            //Handle button top
            // 2. Change the color of the text
            Log.i("Kirsten", "Tapped on button")
            //1. Get a reference to the text view
            // 2. Set the color of the text view
        findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

    // 2. Set up logic to know when user has tapped on button


            // 2. Change the color of the text
    }
}