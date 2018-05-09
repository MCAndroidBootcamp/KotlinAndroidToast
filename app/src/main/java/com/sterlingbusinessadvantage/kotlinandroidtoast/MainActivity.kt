package com.sterlingbusinessadvantage.kotlinandroidtoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_click_me = findViewById(R.id.btn_click_me) as Button

        btn_click_me.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_SHORT).show()
        }
    }
}


