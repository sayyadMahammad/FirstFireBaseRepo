package com.example.firebaseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


//export FIREBASE_APP_ID= 1:207203277535:android:2623ad5bf73cba5dcea76a

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(R.drawable.familyguy)
    }
}