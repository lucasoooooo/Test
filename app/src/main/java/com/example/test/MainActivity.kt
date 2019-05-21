package com.example.test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //create Buttons
       // val btn1 = findViewById<Button> (R.id.button)
       // val btn2 = findViewById<Button> (R.id.button5)


        //Set what happends when clicked
        button.setOnClickListener{

            //change activity
            val intent= Intent(this, WouldYouRather:: class.java)
            startActivity (intent)
        }
    }
}
