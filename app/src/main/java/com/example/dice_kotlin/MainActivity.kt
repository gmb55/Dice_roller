package com.example.dice_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById<View>(R.id.roll_button)
        rollButton.text = "Let's roll!"
        rollButton.setOnClickListener(
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        )
    }
}
