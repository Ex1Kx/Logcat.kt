package com.example.logcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.INFO
    }
        override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        Log.INFO
    }
        override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        Log.INFO
    }
        override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        Log.INFO
    }
        override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        Log.INFO
    }
        override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        Log.INFO
    }
        override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        Log.INFO
    }
}