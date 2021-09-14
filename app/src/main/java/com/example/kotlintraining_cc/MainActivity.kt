package com.example.kotlintraining_cc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Bundle containing previous frozen state
        setContentView(R.layout.activity_main)

        //The content view pointing to the id of layout
        //file activity_main.xml
        val toast = Toast.makeText(applicationContext, "onCreate function called", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        //It will show toast message on screen
        //onStart will be invoked
        val toast = Toast.makeText(applicationContext, "onStart called", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        //onRestart is invoked
        val toast = Toast.makeText(applicationContext, "onRestart called", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        //onResume is invoked
        val toast = Toast.makeText(applicationContext, "onResume is called..", Toast.LENGTH_LONG).show()
    }

    override fun onPause(){
        super.onPause()
        //onPause is invoked
        val toast = Toast.makeText(applicationContext, "onPause is called..", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        //onStop is invoked
        val toast = Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        //onDestroy is invoked
        val toast = Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
    }
}